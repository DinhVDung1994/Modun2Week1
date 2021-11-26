package IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        try{
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Cạnh a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Cạnh b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c: ");
        c = Integer.parseInt(scanner.nextLine());
        if (a<0 || b<0 || c<0){
            System.out.println("Các cạnh phải lớn hơn 0");
        }else if (a+b>c && a+c>b && b+c>a){
            System.out.println(" a b c là 3 cạnh của 1 tam giác");
        }else {
            System.out.println(" không là tam giác");
        }
        // Ngoại lệ khi ko nhập gì

        }catch (Exception e){
            System.out.println("Lỗi: "+e.getMessage());
        }
    }
}
