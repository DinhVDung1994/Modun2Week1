package QuanLySanPham;

import java.util.Scanner;

public class TestSanPham {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SanPham[] sanPham = new SanPham[0];
        while (true) {
            System.out.println("--------------MENU------------------");
            System.out.println("1 - Xem Danh Sach                  -");
            System.out.println("2 - Them Moi                       -");
            System.out.println("3 - Cap Nhat                       -");
            System.out.println("4 - Xoa                            -");
            System.out.println("5 - Sap Xep                        -");
            System.out.println("6 - Tim SP Co Gia Dat Nhat         -");
            System.out.println("------------------------------------");
            System.out.println("Moi Ban Chon");

            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    CoNtrolSanPham.ShowListProduct(sanPham);
                    break;
                case 2:
                    sanPham = CoNtrolSanPham.addProduct(sanPham);
                    break;
                case 3:
                    CoNtrolSanPham.EditProduct(sanPham);
                    break;
                case 4:
                    sanPham = CoNtrolSanPham.XoaSanPham(sanPham);
                    break;
                case 5:
                    CoNtrolSanPham.sapXep(sanPham);
                    break;
                case 6:
                    CoNtrolSanPham.timGiaCaoNhat(sanPham);
                    break;
            }

        }
    }
}
