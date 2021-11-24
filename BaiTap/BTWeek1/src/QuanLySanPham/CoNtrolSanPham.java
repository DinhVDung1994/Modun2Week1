package QuanLySanPham;

import QuanLyThuVien.Sach;

import java.util.*;

public class CoNtrolSanPham {
    static Scanner sc = new Scanner(System.in);
    // Xem Danh Sach San Pham
    public static void ShowListProduct(SanPham[] listProduct){
        for (int i = 0; i < listProduct.length; i++){
                System.out.println(listProduct[i]);
        }
    }

    // Them Moi Thong Tin San Pham
    public static SanPham InforProduct(){
        System.out.println("Nhap Ma San Pham");
        String masp = sc.nextLine();
        System.out.println("Nhap Ten San Pham");
        String tensp = sc.nextLine();
        System.out.println("Nhap Gia San Pham");
        int giasp = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap So luong San Pham");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Mo Ta San Pham");
        String mota = sc.nextLine();
        SanPham newSP = new SanPham(masp,tensp,giasp,soluong,mota);
        return newSP;
    }
    // Them San Pham Vao Danh Sach
    public static SanPham[] addProduct(SanPham[] listProduct){
        SanPham sp = InforProduct();
        SanPham[] newListSP = new SanPham[listProduct.length+1];
        for (int i = 0; i < listProduct.length; i++) {
            newListSP[i] = listProduct[i];
        }
        newListSP[newListSP.length-1] = sp;
        return newListSP;
    }
    //Tim San Pham
    public static int FindProduct(SanPham[] listProduct){
        System.out.println("Nhap Ma San Pham");
        String maSP = sc.nextLine();
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getMasanpham().equals(maSP)){
                return i;
            }
        }
        return -1;
    }
    //Cap Nhat San Pham ( Sua San Pham)
    public static void EditProduct(SanPham[] listProduct){
        int chiSo = FindProduct(listProduct);
        if (chiSo>=0){
            System.out.println("Nhap Ma San Pham");
            String masp = sc.nextLine();
            listProduct[chiSo].setMasanpham(masp);
            System.out.println("Nhap Ten San Pham");
            String tensp = sc.nextLine();
            listProduct[chiSo].setTensanpham(tensp);
            System.out.println("Nhap Gia San Pham");
            int giasp = Integer.parseInt(sc.nextLine());
            listProduct[chiSo].setGia(giasp);
            System.out.println("Nhap So luong San Pham");
            int soluong = Integer.parseInt(sc.nextLine());
            listProduct[chiSo].setSoluong(soluong);
            System.out.println("Mo Ta San Pham");
            String mota = sc.nextLine();
            listProduct[chiSo].setMota(mota);
        }else {
            System.out.println("Khong Co San Pham Trong Kho");
        }
    }
    //Xoa San Pham
    public static SanPham[] XoaSanPham(SanPham[] listProduct){
        int chiSo = FindProduct(listProduct);
        if (chiSo>=0){
            System.out.println("Ban Co Muốn Xóa Sản Phẩm ");
            System.out.println("Bấm 'Y' Để Xóa");
            System.out.println("Bấm Enter 2 lần để Không Xóa SP");

            String y = sc.nextLine();
            if (y.equals("Y")){
                SanPham[] newListProduct = new SanPham[listProduct.length-1];
                for (int i = 0; i < listProduct.length-1; i++) {
                    if (chiSo>i){
                        newListProduct[i] = listProduct[i];
                    }else {
                        newListProduct[i] = listProduct[i+1];
                    }
                }
                System.out.println("Đã Xóa SP");
                return newListProduct;
            }else {
                System.out.println("SP Chưa Được Xóa");
            }

        }else {
            System.out.println("Khong Tim Thay San Pham Trong Kho");
        }
        return listProduct;
    }

    //Sap Xep San Pham
    public static void sapXep(SanPham[] listProduct){
        List<SanPham> listSP = new ArrayList<>();
        for (int i = 0; i < listProduct.length; i++) {
            listSP.add(listProduct[i]);
        }
        Collections.sort(listSP);
        for (SanPham item:listSP) {
            System.out.println(item);
        }
    }
    //Tim San Pham Co Gia Cao Nhat
    public static void timGiaCaoNhat(SanPham[] listProduct){
       int indexMax = 0;
        for (int i = 0; i < listProduct.length; i++) {
           if (listProduct[i].getGia() > listProduct[indexMax].getGia()){
               indexMax = i;
           }
        }
        System.out.println(listProduct[indexMax]);
    }



}
