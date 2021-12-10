package View;

import java.util.*;

public class ViewEmployee {

    public static void menuShow() {
        System.out.println("================================================================");
        System.out.println("1.  Experience Employee ");
        System.out.println("2.  Fresher Employee");
        System.out.println("3.  Intern Employee");
        System.out.println("================================================================");
        System.out.print("Lua Chon Cua Ban La:==>   ");
    }

    public static int menuTopAdmin(Scanner input) {
        System.out.println("================================================================");
        System.out.println("                           ===MENU===");
        System.out.println("1. Them NV");
        System.out.println("2. Sua NV");
        System.out.println("3. Xoa NV");
        System.out.println("4. Tim NV Theo Yeu Cau");
        System.out.println("5. Hien Thi Danh Sach Nhan Vien");
        System.out.println("6. Sap Xep Danh Sach Theo Tên");
        System.out.println("7. Sap Xep Danh Sach Theo Tuổi");
        System.out.println("8. Quản Lý Tài Khoản Đăng Nhập");
        System.out.println("0. Đăng Xuất");
        System.out.println("================================================================");
        System.out.print("Lua Chon Cua Ban La:==>   ");
        int luachon = Integer.parseInt(input.nextLine());
        return luachon;
    }
    public static int menuTopUser(Scanner input) {
        System.out.println("================================================================");
        System.out.println("                           ===MENU===");
        System.out.println("1. Them NV");
        System.out.println("2. Tim NV Theo Yeu Cau");
        System.out.println("3. Hien Thi Danh Sach Nhan Vien");
        System.out.println("4. Sap Xep Danh Sach Theo Tên");
        System.out.println("5. Sap Xep Danh Sach Theo Tuổi");
        System.out.println("6. Tính Lương Tháng");
        System.out.println("0. Đăng Xuất");
        System.out.println("================================================================");
        System.out.print("Lua Chon Cua Ban La:==>   ");
        int luachon = Integer.parseInt(input.nextLine());
        return luachon;
    }
    public static int menuAccount(Scanner input) {
        System.out.println("================================================================");
        System.out.println("                           ===MENU===");
        System.out.println("1. Them User");
        System.out.println("2. Sua User");
        System.out.println("3. Xoa User");
        System.out.println("4. Hien Thi Danh Sach User");
        System.out.println("5. Sap Xep Danh Sach Theo Tên");
        System.out.println("0. Đăng Xuất");
        System.out.println("================================================================");
        System.out.print("Lua Chon Cua Ban La:==>   ");
        int luachon1 = Integer.parseInt(input.nextLine());
        return luachon1;
    }


}
