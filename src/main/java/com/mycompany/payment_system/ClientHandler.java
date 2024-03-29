package com.mycompany.payment_system;

import com.mycompany.cafe_management_app.model.Bill;
import org.json.simple.JSONObject;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import java.io.*;
import java.lang.reflect.Field;
import java.net.Socket;
import java.security.KeyStore;


public class ClientHandler implements Runnable{
    private SSLSocket clientSocket;

    private BufferedReader in;
    private BufferedWriter out;

    public ClientHandler(SSLSocket clientSocket) {
        try {
            this.clientSocket = clientSocket;
            this.out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (Exception e) {
            closeEverything(clientSocket, in, out);
        }
    }

    @Override
    public void run() {
        while (clientSocket.isConnected()) {
            try {
                String request = in.readLine(); //block
                if (request == null) {
                    continue;
                }
//                System.out.println("Server: Request received: " + request);
                handleRequest(request);

            } catch (IOException e) {
                closeEverything(clientSocket, in, out);
                break;
            }
        }
    }

    private void closeEverything(Socket socket, BufferedReader in, BufferedWriter out) {
        try {
            if (socket != null) {
                socket.close();
            }
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleRequest(String request) throws IOException {
        try {
            String cmd = (request == null ) ? "UNKNOWN" : JSONObjUtil.getHeader(request);
//            System.out.println("Server: Command received: " + cmd + " from " + clientSocket.getInetAddress());

            switch (cmd) {
                case "END":
                    System.out.println("Server: Client " + clientSocket.getInetAddress() + " has disconnected");
                    closeEverything(clientSocket, in, out);
                    break;

                case "TRANSACTION":
                    System.out.println("Server: Transaction request received from " + clientSocket.getInetAddress());

//                delay for 3s
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    String res = handleTransaction(JSONObjUtil.getBody(request)) ? "SUCCESS" : "FAILED";
                    out.write(JSONObjUtil.toJson(res, "RESPONSE"));
                    out.newLine();
                    out.flush();

                    System.out.println("Server: Transaction response sent to " + clientSocket.getInetAddress());
                    break;

                default:
                    System.out.println("Server: Unknown command from " + clientSocket.getInetAddress());
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean handleTransaction(Object x) throws NoSuchFieldException {
        System.out.println("Body: " + x);
        JSONObject bill = (JSONObject) x;
        String cardNumber = bill.get("card_number").toString();
        Double billTotalPrice = Double.parseDouble(bill.get("total").toString());

        if (!cardNumber.matches("^[1-9]\\d{15}$")) {
            return false;
        }

        return true;
    }

}
