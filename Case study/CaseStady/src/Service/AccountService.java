package Service;

import IOEmployee.ReadAndWriteAccount;
import Model.Account;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class AccountService {
    static Scanner scanner = new Scanner(System.in);

   static List<Account> accountList = ReadAndWriteAccount.readFile();

    public static void addAccount(Account account){
        for (Account acc:accountList) {
            if (acc.getUsername().equals(account.getUsername())){
                return;
            }
        }
        accountList.add(account);
        ReadAndWriteAccount.writeToFile(accountList);
    }
    public static int findUser(){
        System.out.print("Nhập User Muốn Sửa");
        String user = scanner.nextLine();
        for (int i = 0; i < accountList.size(); i++) {
            if (user.equals(accountList.get(i).getUsername())){
                return i;
            }
        }
        return  -1;
    }
    public static void editAccount(){
        int index = findUser();
        if (index>=0){
            System.out.println("Nhập PassWork Mới");
            accountList.get(index).setPasswork(scanner.nextLine());
            ReadAndWriteAccount.writeToFile(accountList);
            System.out.println("Done!");
        }else {
            System.err.println("Tài Khoản Không Tồn Tại");
        }
    }
    public static void deleteAcc(){
        int index = findUser();
        if (index>=0){
           accountList.remove(index);
            ReadAndWriteAccount.writeToFile(accountList);
            System.out.println("Done!");
        }else {
            System.err.println("Tài Khoản Không Tồn Tại");
        }
    }
    public static List<Account> findAll(){
        return accountList;
    }
    public static boolean login(Account account){
        for (Account acc:accountList) {
            if (acc.getUsername().equals(account.getUsername()) && acc.getPasswork().equals(account.getPasswork())){
                return true;
        }
        }
         {
            System.out.println("Tài Sai hoặc Chưa Tạo mới");
        }
        return false;
    }
    public static boolean loginAdmin(Account account){
        if ("admin".equals(account.getUsername()) && "admin".equals(account.getPasswork())){
            return true;
        }
        return false;

    }
    public static void showListAccount(){
        System.out.println("Danh Sach Tài Khoản");
        for (Account acc:accountList) {
            System.out.println(acc.toString());
        }
    }
    public static void ShowComparableUser(){
        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getUsername().compareTo(o2.getUsername());
            }
        });
        for (Account acc:accountList) {
            System.out.println(acc.toString());
        }
    }
}
