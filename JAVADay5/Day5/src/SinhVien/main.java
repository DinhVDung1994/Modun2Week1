package SinhVien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] SinhVien = new Student[0];

        while (true){
            System.out.println("Menu");
            System.out.println("1. Xuất Danh Sách Sinh Viên");
            System.out.println("2. Thêm Sinh Viên");
            System.out.println("3. Xóa Sinh Viên");
            System.out.println("4. Sửa Thông Tin Sinh Viên");
            System.out.println("0. Thoát");
            int so = Integer.parseInt(sc.nextLine());
            switch (so){
                case 1:
                    ControlSV.show(SinhVien);
                    break;
                case 2:
                    SinhVien = ControlSV.newArrStudent(SinhVien);
                    ControlSV.show(SinhVien);
                    break;
                case 3:
                    SinhVien = ControlSV.DeleteSV(SinhVien);
                    break;
                case 4:
                    SinhVien = ControlSV.EditSV(SinhVien);
                    ControlSV.show(SinhVien);
                case 0:
                    System.exit(0);

            }
        }
    }
}
