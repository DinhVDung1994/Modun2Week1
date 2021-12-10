package ControllerEmployee;

import Service.AccountService;
import Service.EmployeeService;
import View.ViewAccount;
import View.ViewEmployee;

import java.util.Scanner;

public class ManagerEmployee {

    public static Scanner input = new Scanner(System.in);

    public static void mainAdmin() {
        try {
             while (true) {

                int luachon = ViewEmployee.menuTopAdmin(input);
                switch (luachon) {
                    case 1:
                        ViewEmployee.menuShow();
                        int choice = Integer.parseInt(input.nextLine());
                        if (choice == 1) {
                            EmployeeService.addEmployee(choice);
                        } else if (choice == 2) {
                            EmployeeService.addEmployee(choice);
                        } else if (choice == 3) {
                            EmployeeService.addEmployee(choice);
                        } else {
                            System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                        }
                        break;
                    case 2:
                        EmployeeService.editEmployee();
                        break;
                    case 3:
                        EmployeeService.deleteEmployee();
                        break;
                    case 4:
                        ViewEmployee.menuShow();
                        EmployeeService.findEmployeeRequest(Integer.parseInt(input.nextLine()));
                        break;
                    case 5:
                        EmployeeService.showListEmployee();
                        break;
                    case 6:
                        EmployeeService.ShowComparableName();
                        break;
                    case 7:
                        EmployeeService.ShowComparableYear();
                        break;
                    case 8:
                        while (true) {
                                int luachon1 = ViewEmployee.menuAccount(input);
                                switch (luachon1){
                                    case 1:
                                        AccountService.addAccount(ViewAccount.creatAcc());
                                        break;
                                    case 2:
                                        AccountService.editAccount();
                                        break;
                                    case 3:
                                        AccountService.deleteAcc();
                                        break;
                                    case 4:
                                        AccountService.showListAccount();
                                        break;
                                    case 5:
                                        AccountService.ShowComparableUser();
                                        break;
                                    case 0:
                                        return;
                                    default:
                                        System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                                        break;
                                }
                            }
                    case 0:
                        return;
                    default:
                        System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                        break;
                }
            }


        }catch (Exception e){
            System.err.println("Lua Chon Cua Ban Khong Ton Tai");
            mainAdmin();
        }
    }




    public static void mainUser() {
       while (true) {
           try {
               int luachon = ViewEmployee.menuTopUser(input);
               switch (luachon) {
                   case 1:
                       ViewEmployee.menuShow();
                       int choice = Integer.parseInt(input.nextLine());
                       if (choice == 1) {
                           EmployeeService.addEmployee(choice);
                       } else if (choice == 2) {
                           EmployeeService.addEmployee(choice);
                       } else if (choice == 3) {
                           EmployeeService.addEmployee(choice);
                       } else {
                           System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                       }
                       break;

                   case 2:
                       ViewEmployee.menuShow();
                       EmployeeService.findEmployeeRequest(Integer.parseInt(input.nextLine()));
                       break;
                   case 3:
                       EmployeeService.showListEmployee();
                       break;
                   case 4:
                       EmployeeService.ShowComparableName();
                       break;
                   case 5:
                       EmployeeService.ShowComparableYear();
                       break;
                   case 6:
                       EmployeeService.getMoney();
                       break;
                   case 0:
                       ManagerLogin.menuloginAcc();
                   default:
                       System.err.println("Lua Chon Cua Ban Khong Ton Tai");
                       break;
               }
           }catch (Exception e){
               mainUser();
           }

       }
    }
}
