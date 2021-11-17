package SinhVien;

import java.util.Scanner;

public class ControlSinhVien {
    static Scanner sc = new Scanner(System.in);

    public static SinhVien newInforSV() {
        System.out.println("Nhập Họ Tên SV: ");
        String name = sc.nextLine();
        System.out.println("Nhập Số Điện Thoại: ");
        String phonenumber = sc.nextLine();
        System.out.println("Nhập Địa Chỉ: ");
        String address = sc.nextLine();

        SinhVien newSV = new SinhVien(name, phonenumber, address);

        return newSV;
    }

    public static SinhVien[] addSinhVien(SinhVien[] listSV) {
        SinhVien addSV = newInforSV();
        SinhVien[] newArr = new SinhVien[listSV.length + 1];
        for (int i = 0; i < listSV.length; i++) {
            newArr[i] = listSV[i];
        }
        newArr[newArr.length - 1] = addSV;
        return newArr;
    }

    public static void ShowListSV(SinhVien[] listSV) {
        for (int i = 0; i < listSV.length; i++) {
            System.out.println(listSV[i].toString());
        }
    }

    public static int FindIndex(SinhVien[] listSV) {
        System.out.println("Nhập Mã SV: ");
        int SoSV = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < listSV.length; i++) {
            if (SoSV == listSV[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public static SinhVien[] EditSV(SinhVien[] listSV) {
        int chiSo = FindIndex(listSV);
        if (chiSo==-1){
            System.out.println("Không Tìm Thấy Sinh Viên");
        }else if (chiSo > 0) {
            System.out.println("Nhập Họ Tên SV: ");
            String name = sc.nextLine();
            listSV[chiSo].setName(name);
            System.out.println("Nhập Số Điện Thoại: ");
            String phonenumber = sc.nextLine();
            listSV[chiSo].setPhonenumber(phonenumber);
            System.out.println("Nhập Địa Chỉ: ");
            String address = sc.nextLine();
            listSV[chiSo].setAddress(address);
        }
        return listSV;
    }

    public static SinhVien[] DeleteSV(SinhVien[] listSV) {
        int chiSo = FindIndex(listSV);
        if (chiSo == -1) {
            System.out.println("Không Tìm Thấy SV Cần Xóa");
        } else {
           // System.out.println("Chi So = " + chiSo);
            SinhVien[] newArrDel = new SinhVien[listSV.length - 1];
            for (int i = 0; i < listSV.length - 1; i++) {
              //  System.out.println("i= " + i);
                if (i < chiSo) {
                    newArrDel[i] = listSV[i];
               //     System.out.println("trong if ---> " + newArrDel[i]);
                } else {
                    newArrDel[i] = listSV[i + 1];
               //     System.out.println("trong else--->" + newArrDel[i]);
                }
            }
            return newArrDel;
        }
        return listSV;
    }
}
