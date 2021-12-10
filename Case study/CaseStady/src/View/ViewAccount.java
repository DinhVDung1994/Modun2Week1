package View;

import Model.Account;
import Service.ValidateAccount;

import java.util.Scanner;

public class ViewAccount {

   static Scanner scanner = new Scanner(System.in);
    public static int menuTop(){
        System.out.println("==========================================1. Đăng Nhập==========================================");
        System.out.println("==========================================2. Đăng Ký============================================");
        System.out.println("==========================================3. Thoát Chương Trình=================================");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public static Account creatAcc(){
        String nameacc = ValidateAccount.validateUser();

        String passacc = ValidateAccount.validatePass();

        Account newAcc = new Account(nameacc,passacc);
        return newAcc;
    }
}
