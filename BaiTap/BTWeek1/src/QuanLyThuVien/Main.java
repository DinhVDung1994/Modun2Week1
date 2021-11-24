package QuanLyThuVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sach[] listSach = new Sach[0];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========Menu============");
            System.out.println("= 1. THÊM SÁCH           =");
            System.out.println("= 2. SỬA                 =");
            System.out.println("= 3. Xóa                 =");
            System.out.println("= 4. HIỂN THỊ            =");
            System.out.println("==========================");
            System.out.println("----Mời Bạn Chọn----------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    listSach = ControlSach.addBook(listSach);
                    break;
                case 2:
                    ControlSach.EditBook(listSach);
                    break;
                case 3:
                    listSach = ControlSach.XoaBook(listSach);
                    break;
                case 4:
                    ControlSach.ShowListBook(listSach);
                    break;
            }
        }
    }
}
