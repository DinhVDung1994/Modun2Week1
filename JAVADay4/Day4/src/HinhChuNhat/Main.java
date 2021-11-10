package HinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HinhChuNhat Rectangle1 = new HinhChuNhat();
        HinhChuNhat Rectangle2 = new HinhChuNhat();
        HinhChuNhat Rec = new HinhChuNhat();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài:");
        Rectangle1.setWidth(input.nextDouble());
        System.out.println("Nhập Chiều Rộng: ");
        Rectangle1.setHeight(input.nextDouble());
        Rectangle2 = new HinhChuNhat(8,7);
        Rec.setWidth(5);
        Rec.setHeight(8);
        System.out.println(Rectangle1.ChuVi());
        System.out.println(Rectangle1.DienTich());
        System.out.println(Rectangle1.toString());
        System.out.println(Rectangle2.toString());
        System.out.println(Rec.toString());
    }
}
