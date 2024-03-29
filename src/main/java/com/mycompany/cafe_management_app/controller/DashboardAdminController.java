/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe_management_app.controller;

import com.mycompany.cafe_management_app.ui.DashboardAdminUI.DetailsItem;
import com.mycompany.cafe_management_app.model.Account;
import com.mycompany.cafe_management_app.model.Bill;
import com.mycompany.cafe_management_app.model.Dish;
import com.mycompany.cafe_management_app.model.DishDetail;
import com.mycompany.cafe_management_app.model.Revenue;
import com.mycompany.cafe_management_app.model.Staff;
import com.mycompany.cafe_management_app.service.AdminService;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.BillItem;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.ConfirmBeforeDelete;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.DashboardAdminUI;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.DishForm;
import com.mycompany.cafe_management_app.ui.InitErrorUI;
import com.mycompany.cafe_management_app.util.callback.DeleteEvent;
import com.mycompany.cafe_management_app.util.callback.EditEvent;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.NewStaffForm;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.SizePriceInputItem;
import com.mycompany.cafe_management_app.ui.DashboardAdminUI.StaffItem;
import com.mycompany.cafe_management_app.ui.MenuItem;
import com.mycompany.cafe_management_app.ui.DetailsDish;
import com.mycompany.cafe_management_app.util.ErrorUtil;
import com.mycompany.cafe_management_app.util.StaffUtil;
import com.mycompany.cafe_management_app.util.callback.DeleteDishInterface;
import com.mycompany.cafe_management_app.util.callback.DeleteStaffInterface;
import com.mycompany.cafe_management_app.util.callback.DetailDishInterface;
import com.mycompany.cafe_management_app.util.callback.EditDishInterface;
import com.mycompany.cafe_management_app.util.callback.EditStaffInterface;
import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.*;

import com.mycompany.cafe_management_app.util.ClosePaymentConnection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author namho
 */
public class DashboardAdminController {
    private DashboardAdminUI dashboardAdminUI;
    private AdminService adminService;
    private JButton addStaffBtn;
    private JButton addDishBtn;
    private JPanel wrapListStaff;    
    private JPanel wrapListDish;
    private JPanel wrapListBill;
    private ErrorUtil errorUtil;
    private JPanel chartContainer;
    private DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
<<<<<<< Updated upstream
    private JTextField searchStaffFieldl;
    private JTextField searchMenuFieldl;

=======
    private StaffUtil staffUtil;
>>>>>>> Stashed changes
    
    public DashboardAdminController() {
        initController();
    }
    
    private void initController() {
        staffUtil = new StaffUtil();
        dashboardAdminUI = new DashboardAdminUI();
        dashboardAdminUI.addWindowListener(new CloseConnection());
        adminService = new AdminService();
        errorUtil = ErrorUtil.getInstance();
       
        // Staff -----------------------------------------------------------

        //show list staff 
        wrapListStaff = dashboardAdminUI.getContainerListStaff();
        // click new staff btn
        addStaffBtn = dashboardAdminUI.getAddStaffBtn();
        addStaffBtn.addActionListener(new addStaffEvent());
        dashboardAdminUI.getSearchBtn().addActionListener(new SearchStaffAction());
        
        //search staff
        searchStaffFieldl = dashboardAdminUI.getSearchStaffField();
        searchStaffFieldl.addKeyListener(new ClickToSearchStaff());
        
        // Menu -----------------------------------------------------------
        wrapListDish = dashboardAdminUI.getListDishContainer();
        addDishBtn = dashboardAdminUI.getAddDishBtn();
        addDishBtn.addActionListener(new addDishListener());  
        searchMenuFieldl = dashboardAdminUI.getSearchMenuField();
        searchMenuFieldl.addKeyListener(new ClickToSearchMenu());
        
        //Bill -----------------------------------------------------------
        wrapListBill = dashboardAdminUI.getBillContainer();
        renderListBill();
        re_renderListUI();
        dashboardAdminUI.setVisible(true);
        
        
        //Chart ----------------------------------------------------------
        chartContainer = dashboardAdminUI.getChartContainer();
        chartContainer.setBackground(Color.red);
        dashboardAdminUI.getNavItemChart().addActionListener(new ShowChart());
        
        //Log Out--------------------------------------------------------
        dashboardAdminUI.getLogOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dashboardAdminUI.dispose();
                LoginController loginController = new LoginController();
                loginController.getLoginUI().setVisible(true);
            }
        });
    }

//    Add window listener
    private class CloseConnection implements WindowListener {
        @Override
        public void windowClosing(WindowEvent e) {
            dashboardAdminUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            int confirmed = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to exit?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                try {
                    ClosePaymentConnection.closeConnectionWithPaymentServer();
                    dashboardAdminUI.dispose();
                    System.exit(0);
                } catch (IOException ex) {
                    new InitErrorUI("Error", "Cannot close connection with payment server");
                    ex.printStackTrace();
                }
            }
        }
        @Override
        public void windowOpened(WindowEvent e) {
        }
        @Override
        public void windowClosed(WindowEvent e) {
        }
        @Override
        public void windowIconified(WindowEvent e) {
        }
        @Override
        public void windowDeiconified(WindowEvent e) {
        }
        @Override
        public void windowActivated(WindowEvent e) {
        }
        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }

//    Staff method ----------------------------------------------------------------------------------------------------------
    private void renderListStaff(List<Staff> listStaff) {
        int statusCode = errorUtil.getErrorCode();
        if (statusCode == 0) {
            for (int i = 0; i < listStaff.size(); i++) {
                Staff tmpStaff = listStaff.get(i);
                String name = tmpStaff.getName();
                String dob = tmpStaff.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM yyyy"));
                String phone = tmpStaff.getPhoneNumber();
                String pos = tmpStaff.getSalaryOfCurrentMonth().toString() + " VND";
                EditEvent editEvent = new EditEvent(new EditFunction());
                DeleteEvent deleteEvent = new DeleteEvent(new DeleteFunc());
                StaffItem tmp = new StaffItem(tmpStaff, name, dob, phone, pos, editEvent, deleteEvent);
                wrapListStaff.add(tmp);
            }
        }
    }
    
    private void re_renderListUI() {
            wrapListStaff.removeAll();
            wrapListDish.removeAll();
            renderListStaff(adminService.getAllStaff());
            renderListMenu(adminService.getAllDish());
            dashboardAdminUI.revalidate();
    }

    void addStaff(NewStaffForm form) {
        String username =  form.getUserNameField().getText();
        String pass =  form.getPasswordField().getText();
        String name =  form.getNameField().getText();
        String phone =  form.getPhoneField().getText();
        String pos =  form.getPosField().getText();
        String day =  form.getDayField().getText();
        String month =  form.getMonthField().getText();
        String year =  form.getYearField().getText();
            if (staffUtil.validation(username, pass, name, phone, pos, day, month, year)) {
                LocalDate dob = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month ), Integer.parseInt(day));
                Staff staff = new Staff( name, dob, phone, pos);
                staff.setAccount(new Account(username, pass, "staff"));
                adminService.saveStaff(staff);
                if (errorUtil.getErrorCode() == 0) {
                    new NotificationController("Add staff successfully !");
                } else {
                    new NotificationController("Add staff failed !");
                }
                form.dispose();
            } 
     }
       
        
    private class saveStaff implements ActionListener {
        private NewStaffForm form;
        public saveStaff(NewStaffForm form) {
            this.form = form;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            addStaff(form);
           re_renderListUI();
        }
        
    }
    
    public class EditFunction implements EditStaffInterface{
        @Override
        public void execute(NewStaffForm form, Staff editedStaff) {
            staffUtil.updateStaff(form, editedStaff, adminService, errorUtil);
            re_renderListUI();
        }
    }
    
    public class DeleteFunc implements DeleteStaffInterface {
        @Override
        public void execute(Staff staff) {
            ConfirmBeforeDelete res = new ConfirmBeforeDelete(new Supplier<Void>() {
                @Override
                public Void get() {
                    adminService.deleteStaff(staff);
                    if (errorUtil.getErrorCode() == 0) {
                        new NotificationController("Delete staff successfully !");
                    } else {
                        new NotificationController("Delete staff failed !");
                    }
                    re_renderListUI();
                    dashboardAdminUI.dispose();
                    dashboardAdminUI.setVisible(true);
                    return null;
                }
            });
            res.setVisible(true);
        }
    }
    
    private class addStaffEvent implements ActionListener {        
        @Override
        public void actionPerformed(ActionEvent e) {
            NewStaffForm  form = new NewStaffForm();
            form.setVisible(true);
            form.getSaveButton().addActionListener(new saveStaff(form));
        }
    }
    
    private class ClickToSearchStaff implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String nameStaff = searchStaffFieldl.getText();
            wrapListStaff.removeAll();
            if (nameStaff.equals("")) {
                renderListStaff(adminService.getAllStaff()); 
            } else {
                renderListStaff(adminService.searchStaffByName(nameStaff));
            }
            dashboardAdminUI.dispose();
            dashboardAdminUI.setVisible(true);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }
   
    private class SearchStaffAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new SearchStaffController(adminService, errorUtil,new Supplier<Void>() {
                @Override
                public Void get() {
                    re_renderListUI();
                    return  null;
                }
            });
            
        }
        
    }
    
    //    Menu method ----------------------------------------------------------------------------------------------------------
    private void renderListMenu(List<Dish> listDish) {
        if (errorUtil.getErrorCode() == 0) {
            for (Dish dish : listDish) {
                wrapListDish.add(new MenuItem(dish, new DetailsDishFunction(), new EditDishFunction(), new DeleteDishFunction(), Boolean.FALSE));
            }
        }
    }
    
   public class DetailsDishFunction implements DetailDishInterface {
       @Override
       public void showDetails(Long id) {
           DetailsDish frame = new DetailsDish();
           JPanel container = frame.getContainer();
           List<DishDetail> list = adminService.getDetailsOf(id);
           if (errorUtil.getErrorCode() == 0) {
               for (int i = 0; i < list.size(); i++) {
                    String size = list.get(i).getSize();
                    String price = list.get(i).getPrice().toString();
                    container.add(new DetailsItem(size, price));
                }
                frame.setVisible(true);
           }
       }
   }
   
   public class DeleteDishFunction implements DeleteDishInterface {
       public void delete(Dish dish) {
           ConfirmBeforeDelete res = new ConfirmBeforeDelete(new Supplier<Void>() {
               public Void get() {
                    adminService.deleteDish(dish);
                    if (errorUtil.getErrorCode() == 0) {
                        new NotificationController("Delete dish successfully !");
                    } else {
                        new NotificationController("Delete dish failed !");
                    }
                    re_renderListUI();
                    dashboardAdminUI.dispose();
                    dashboardAdminUI.setVisible(true);
                    return null;
                }
           });
           res.setVisible(true);
       }
   }
   
    public class EditDishFunction implements EditDishInterface {
       public void execute(Dish dish, Long id) {
           DishForm dishForm = new DishForm(dish.getName(), adminService.getDetailsOf(id));
           dishForm.getSaveBtn().addActionListener(new SaveDishForm("update", dish, dishForm));
           dishForm.setVisible(true);
       }
   }
     
    private boolean validateDishForm(String name, List<SizePriceInputItem> list) {
         if (name.equals("")) {
             new NotificationController("Dish name is invalid !");
             return false;
         }
         if (list.size() == 0) {
             new NotificationController("Size or price of dish is invalid !");
             return false;
         }
         for (SizePriceInputItem item : list) {
             String size = item.getSizeInput().getText();
             String price = item .getPriceInput().getText();
             if (size.equals("")| price.equals("")) {
                 new NotificationController("Size or price of dish is invalid !");
                 return false;
             }
         }
         return true;
     }
   
   private class addDishListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DishForm dishForm = new DishForm();
             dishForm.getSaveBtn().addActionListener(new SaveDishForm("add", new Dish(), dishForm));
             dishForm.setVisible(true);
        }
   }
   
   private class SaveDishForm implements ActionListener {
       private String type;
       private Dish dish;
       private DishForm dishForm;
       public SaveDishForm(String type, Dish dish,  DishForm dishForm){
           this.type = type;
           this.dish = dish;
           this.dishForm = dishForm;
       }

        @Override
        public void actionPerformed(ActionEvent e) {
             JTextField dishNameInputField = dishForm.getNameInput();
             List<SizePriceInputItem> listSizePriceInput = dishForm.getListSizePriceInput();
             String name = dishNameInputField.getText();
             if (validateDishForm(name , listSizePriceInput)) {
                 List<DishDetail> newListDetails = null;
                 List<DishDetail> currListDetails = null;
                 dish.setName(name);
                 if (type.equals("update")) {
                    newListDetails = new ArrayList<>();
                    currListDetails = adminService.getDetailsOf(dish.getId());
                 }
                 int index = 0;
                 for(SizePriceInputItem item: listSizePriceInput) {
                     String size = item.getSizeInput().getText();
                     Double price = Double.parseDouble(item.getPriceInput().getText());
                     DishDetail detail = new DishDetail(size, price);

                     if (type.equals("update")) {
                         if (index < currListDetails.size()) {
                             detail.setId(currListDetails.get(index).getId());
                         }
                         detail.setDish(dish);
                         newListDetails.add(detail);
                     } else if (type.equals("add")) {
                         dish.addDetail(detail);
                     }

                     index++;
                }

                
                if (type.equals("add")) {
                    adminService.saveDish(dish);
                    if (errorUtil.getErrorCode() == 0) {
                        new NotificationController("Add dish successfully !");
                    } else {
                        new NotificationController("Add dish failed !");
                    }
                } else if (type.equals("update")) {
                    adminService.updateDish(dish, newListDetails);
                    if (errorUtil.getErrorCode() == 0) {
                        new NotificationController("Update dish successfully !");
                    } else {
                        new NotificationController("Update dish failed !");
                    }
                }
                
                 re_renderListUI();
                dishForm.dispose();
             } else {
                 dishForm.dispose();
             }
        }
       
   }
   
   private class ClickToSearchMenu implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                wrapListDish.removeAll();
                String dishName = searchMenuFieldl.getText();
                if (dishName.equals("")) {
                    renderListMenu(adminService.getAllDish());
                } else {
                    renderListMenu(adminService.searchDishByName(dishName));
                }
                dashboardAdminUI.dispose();
                dashboardAdminUI.setVisible(true);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
       
   }
   
   //Bill method ------------------------------------------------------------------------------------
   private void renderListBill() {
       List<Bill> list = adminService.getAllBills();
       if (errorUtil.getErrorCode() == 0) {
            int i = 0;
            for (Bill item: list ) {
                i++;
                String index = Integer.toString(i);
                DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                 String time = item.getTimeCreated().format(CUSTOM_FORMATTER);
                 String received = Double.toString(item.getReceivedAmount());
                 String returned = Double.toString(item.getReturnedAmount());
                 String total = Double.toString(item.getTotalPrice());
                wrapListBill.add(new BillItem(index, time, received, returned, total));
            }
       }
   }
   //Chart method ------------------------------------------------------------------------------------
   private class ShowChart implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            chartContainer.removeAll();
            List<Revenue> listRevenues = adminService.getAllRevenues();
            System.out.println(listRevenues.size());
            if (errorUtil.getErrorCode() == 0) {
                var dataset = new DefaultCategoryDataset();
                for (Revenue item : listRevenues) {
                    String time = item.getCheckinTime().format(CUSTOM_FORMATTER);
                    double revenue = item.getTotal();
                    dataset.setValue(revenue, "", time);
                    System.out.println(time + " " + revenue);
                }
                chartContainer.add(initChart(dataset));
            }
        }
   }
   
    private ChartPanel initChart(CategoryDataset dataset) {
        JFreeChart chart = createChart(dataset);
         chart.getCategoryPlot().getRenderer().setSeriesPaint(0, new Color(72, 229, 194));
       
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "",
                "",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }
}
