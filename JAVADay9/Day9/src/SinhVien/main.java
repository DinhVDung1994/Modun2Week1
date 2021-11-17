package SinhVien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinhVien[] listSV = new SinhVien[2];
        listSV[0] = new SinhVien("Hoa Nhài","0123456789","Đại Nam");
        listSV[1] = new SinhVien("Hoa Lan","012487869","Đại Bắc");


        while (true) {
            System.out.println("=========Menu=========");
            System.out.println("1. Thêm Sinh Viên");
            System.out.println("2. Sửa Sinh Viên");
            System.out.println("3. Xóa Sinh Viên");
            System.out.println("4. Hiển Thị Danh Sách Sinh Viên");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    listSV = ControlSinhVien.addSinhVien(listSV);
                    break;
                case 2:
                    listSV = ControlSinhVien.EditSV(listSV);
                    break;
                case 3:
                    listSV = ControlSinhVien.DeleteSV(listSV);
                    break;
                case 4:
                    ControlSinhVien.ShowListSV(listSV);
                    break;
            }
        }
    }
}
