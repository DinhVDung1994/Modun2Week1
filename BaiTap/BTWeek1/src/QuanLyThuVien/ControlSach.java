package QuanLyThuVien;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ControlSach {

    static Scanner input = new Scanner(System.in);

    public static Sach newInforbook(){
        System.out.println("Nhập Tên Sách:");
        String namebook = input.nextLine();
        System.out.println("Nhập Loại Sách:");
        String loaibook = input.nextLine();
        System.out.println("Nhập Năm Xuất Bản:");
        int year = Integer.parseInt(input.nextLine());
        System.out.println("Nhập Tên Tác Giả:");
        String nametacgia = input.nextLine();
        Sach newSach = new Sach(namebook,loaibook,year,nametacgia);
        return newSach;
    }
    public static Sach[] addBook(Sach[] listSach){
        Sach addbook = newInforbook();
        Sach[] newArr = new Sach[listSach.length+1];
        for (int i = 0; i < listSach.length; i++) {
            newArr[i] = listSach[i];
        }
        newArr[newArr.length-1] = addbook;
        return newArr;
    }

    public static void ShowListBook(Sach[] listSach){
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Loại Sách", "Tên Sách", "Năm Xuất Bản", "Tên TÁc Giả");
        for (int i = 0; i < listSach.length; i++) {
            System.out.printf("%-15s %-15s %-15s %-15s\n",
                    listSach[i].getTensach(),listSach[i].getLoaisach(),
                    listSach[i].getNamxuatban(),listSach[i].getTentacgia());
        }
//        for (int i = 0; i < listSach.length; i++) {
//            System.out.println("Loại Sách: "+listSach[i].getLoaisach()+"- Tên Sách: "
//                    +listSach[i].getTensach()+"- Tên Tác Giả: "
//                    +listSach[i].getTentacgia()+"- Năm Xuất Bản: "
//                    +listSach[i].getNamxuatban());
//
//        }
    }

    public static int FindIndex(Sach[] listSach){
        int index = -1;
        System.out.println("Nhập Tên Sách Muốn Tìm");
        String namefind = input.nextLine();
        for (int i = 0; i < listSach.length; i++) {
            if (namefind.equals(listSach[i].getTensach())){
                index = i;
            }
        }
        return index;
    }

    public static void EditBook(Sach[] listSach){
        int chiSo = FindIndex(listSach);
        if (chiSo>=0){
                System.out.println("Nhập Tên Sách:");
                String namebook = input.nextLine();
                listSach[chiSo].setTensach(namebook);
                System.out.println("Nhập Loại Sách:");
                String loaibook = input.nextLine();
                listSach[chiSo].setLoaisach(loaibook);
                System.out.println("Nhập Năm Xuất Bản:");
                int year = Integer.parseInt(input.nextLine());
                listSach[chiSo].setNamxuatban(year);
                System.out.println("Nhập Tên Tác Giả:");
                String nametacgia = input.nextLine();
                listSach[chiSo].setTentacgia(nametacgia);
                ShowListBook(listSach);
        }else {
            System.out.println("Khong Tim Thay Sach");
        }
    }

    public static Sach[] XoaBook(Sach[] listSach){
        int viTri = FindIndex(listSach);
        if (viTri>=0){
            Sach[] arrNew = new Sach[listSach.length-1];
            for (int i = 0; i < listSach.length-1; i++) {
                if (i<viTri){
                    arrNew[i] = listSach[i];
                }else {
                    arrNew[i] = listSach[i+1];
                }
            }
            return arrNew;
        }else {
            System.out.println("Khong Tim Thay Sach");
        }
        return listSach;
    }


}
