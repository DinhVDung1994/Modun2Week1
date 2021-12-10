package Service;

import java.util.Scanner;

public class ValidateAccount {
    static Scanner scanner = new Scanner(System.in);
    public static String validateUser(){
        String User;
        while (true){
            System.out.println("Nhập Tài KHoản");
            try {
               User = scanner.nextLine();
               if (User.matches("^[a-zA-Z0-9]+$")){
                   break;
               }else {
                   System.err.println("Tài Khoản Không Được Chứa Dấu Cách/Khoảng Trắng");
               }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return User;
    }
    public static String validatePass(){
        String pass;
        while (true){
            System.out.println("Nhập Pass");
            try {
                pass = scanner.nextLine();
                if (pass.matches("^[a-zA-Z0-9]+$")){
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return pass;
    }
}
