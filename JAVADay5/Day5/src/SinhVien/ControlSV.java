package SinhVien;

import java.util.Scanner;

public class ControlSV {
    static Scanner scanner = new Scanner(System.in);

    public static Student newInforSV() {
        System.out.print("Nhập Mã SV: ");
        String masv = scanner.nextLine();
        System.out.print("Nhập Họ Tên SV: ");
        String hotensv = scanner.nextLine();
        System.out.print("Nhập TH: ");
        float diem1 = scanner.nextFloat();scanner.nextLine();
        System.out.print("Nhập LT: ");
        float diem2 = scanner.nextFloat();scanner.nextLine();
        Student newSV = new Student(masv, hotensv, diem1, diem2);
        return newSV;
    }

    public static Student[] newArrStudent(Student[] SinhVien) {
        Student addSV = newInforSV();
        Student[] newArr = new Student[SinhVien.length + 1];
        for (int i = 0; i < SinhVien.length; i++) {
            newArr[i] = SinhVien[i];
        }
        newArr[newArr.length - 1] = addSV;
        return newArr;
    }

    public static int FindIndex(Student[] SinhVien) {
        System.out.println("Nhập Mã SV");
        String SoSV = scanner.nextLine();
        for (int i = 0; i < SinhVien.length; i++) {
            if (SoSV.equals(SinhVien[i].getMaSV())) {
               // System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static Student[] DeleteSV(Student[] SinhVien) {
        int index = FindIndex(SinhVien);
        if (index >= 0) {
            Student[] newArrDelete = new Student[SinhVien.length - 1];
            for (int i = 0; i < SinhVien.length-1; i++) {
                if (i < index) {
                    newArrDelete[i] = SinhVien[i];
                } else
                    newArrDelete[i] = SinhVien[i + 1];
            }
            return newArrDelete;
        }else {
            System.out.println("SV Không Tồn Tại");
        }
        return SinhVien;
    }

    public static void show(Student[] SinhVien) {
        for (int i = 0; i < SinhVien.length; i++) {
            System.out.println(SinhVien[i].getMaSV() + "-" + SinhVien[i].getHoTenSV() + " Điểm TH: " + SinhVien[i].getDiemTH() + " Điểm LT" + SinhVien[i].getDiemLT() + " Diem TB: " + SinhVien[i].diemTB());
        }
    }
    public static Student[] EditSV(Student[] SinhVien){
        int chiSo = FindIndex(SinhVien);
        if (chiSo>=0){
            while (true){
                System.out.println("Menu");
                System.out.println("1. Sửa MSV");
                System.out.println("2. Sửa HT");
                System.out.println("3. Sửa Điểm TH");
                System.out.println("4. Sửa Điểm LT");
                System.out.println("5. Sửa Toàn Bộ Thông Tin");
                System.out.println("6. Quay Lại Menu Chính");
                System.out.println("0. EXIT");
                int num = scanner.nextInt();scanner.nextLine();
                switch (num){
                    case 1:
                        System.out.print("Nhập Mã SV Mới: ");
                        String masv = scanner.nextLine();
                        SinhVien[chiSo].setMaSV(masv);
                        //System.out.println(SinhVien[chiSo].getMaSV()+SinhVien[chiSo].getHoTenSV()+SinhVien[chiSo].getDiemLT()+SinhVien[chiSo].getDiemTH());
                        show(SinhVien);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.print("Nhập Mã SV Mới: ");
                        String masv1 = scanner.nextLine();
                        SinhVien[chiSo].setMaSV(masv1);
                        System.out.print("Nhập Họ Tên SV Mới : ");
                        String hotensv1 = scanner.nextLine();
                        SinhVien[chiSo].setHoTenSV(hotensv1);
                        System.out.print("Nhập TH Mới : ");
                        float diema = scanner.nextFloat();scanner.nextLine();
                        SinhVien[chiSo].setDiemTH(diema);
                        System.out.print("Nhập LT Mới : ");
                        float diemb = scanner.nextFloat();scanner.nextLine();
                        SinhVien[chiSo].setDiemLT(diemb);
                        show(SinhVien);
                        break;
                    case 6:
                        new main();
                    case 0:
                        System.exit(0);
                }
            }
        }
        return SinhVien;
    }

}
