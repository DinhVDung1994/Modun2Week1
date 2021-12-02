package QuanLySanPham;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductManager {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<>();
        while (true) {
            System.out.println("------------MENU---------------");
            System.out.println("1. Them                       -");
            System.out.println("2. Xoa                        -");
            System.out.println("3. Sua                        -");
            System.out.println("4. Hien Thi                   -");
            System.out.println("0. Exit                       -");
            System.out.println("-------------------------------");
            System.out.println("7. Danh Sach SP Test Demo");
            int luachon = Integer.parseInt(input.nextLine());
            switch (luachon) {
                case 1:
                    addProducts(listProduct);
                    break;
                case 2:
                    deleteProduct(listProduct);
                    break;
                case 3:
                    editProducts(listProduct);
                    break;
                case 4:
                    showProduct(listProduct);
                    break;
                case 0:
                    System.exit(0);
                    break;
                case 7:
                    Product sp1 = new Product("Rau1",16000,LocalDate.now(),21);
                    Product sp2 = new Product("Rau2",17000,LocalDate.now(),15);
                    Product sp3 = new Product("Rau3",18000,LocalDate.now(),19);
                    Product sp4 = new Product("Rau4",19000,LocalDate.now(),34);
                    Product sp5 = new Product("Rau5",20000,LocalDate.now(),12);
                    listProduct.add(sp1);
                    listProduct.add(sp2);
                    listProduct.add(sp3);
                    listProduct.add(sp4);
                    listProduct.add(sp5);
                    break;
                default:
                    System.err.println("Khong Co Lua Chon So: " + luachon);
            }
        }

    }

    private static void editProducts(ArrayList<Product> listProduct) {
        int check = 0;
        System.out.println("Nhap ID San Pham Muon Sua: ");
        int index = Integer.parseInt(input.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (index == listProduct.get(i).getId()) {
                check++;
                editSanPham(i,listProduct);
            }
        }
        if (check==0) {
            System.out.println("Khong Tim Thay San Pham Trong Danh Sach");
        }
    }

    private static void deleteProduct(ArrayList<Product> listProduct) {
        int count =0;
        System.out.println("Nhap ID SP Muon Xoa: ");
        int index = Integer.parseInt(input.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (index == listProduct.get(i).getId()) {
               count++;
                listProduct.remove(i);
            }
        }
        if (count==0) {
            System.out.println("Khong Tim Thay San Pham Trong Danh Sach");
        }
    }

    private static void showProduct(ArrayList<Product> listProduct) {
        for (Product X : listProduct) {
            System.out.println(X);
        }
    }

    private static void addProducts(ArrayList<Product> listProduct) {

        System.out.println("Nhap Ten SP:");
        String tensp = input.nextLine();
        System.out.println("Nhap Gia SP:");
        double gia = Double.parseDouble(input.nextLine());
     //   System.out.println("Nhap NSX");
       LocalDate date = LocalDate.now();
        System.out.println("Nhap So Luong:");
        int numbers = Integer.parseInt(input.nextLine());
        Product newSP = new Product(tensp,gia,date,numbers);
        listProduct.add(newSP);

    }

    private static void editSanPham(int index, ArrayList<Product> listSP) {
        System.out.println("Nhap Ten SP:");
        String tensp = input.nextLine();
        listSP.get(index).setNameproduct(tensp);
        System.out.println("Nhap Gia SP:");
        double gia = Double.parseDouble(input.nextLine());
        listSP.get(index).setPrice(gia);
        System.out.println("Nhap So Luong:");
        int numbers = Integer.parseInt(input.nextLine());
        listSP.get(index).setSoluong(numbers);
    }

}
