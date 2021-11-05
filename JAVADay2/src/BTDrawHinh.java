import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class BTDrawHinh {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Vẽ Hình Tam Giác Vuông Góc Trên Bên Trái");
        System.out.println("2.Vẽ Hình Tam Giác Vuông Góc Trên Bên Phải");
        System.out.println("3.Vẽ Hình Tam Giác Vuông Góc Dưới Bên Trái");
        System.out.println("4.Vẽ Hình Tam Giác Vuông Góc Dưới Bên Phải");
        System.out.println("5.Vẽ Hình Tam Giác Cân");
        System.out.println("6.Vẽ Hình Vuông");
        System.out.println("7.Vẽ Hình Chữ Nhật");
        System.out.println("0. Exit");
        System.out.println("Enter Your Choice");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Scanner Canh = new Scanner(System.in);
                    System.out.println("Nhập Chiều Dài Cạnh: ");
                    int a = input.nextInt();
                    for (int i = a; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 2:
                    System.out.println("Nhập Chiều Dài Cạnh: ");
                    int b = input.nextInt();
                    for (int i = 1; i <= b; i++) {
                        for (int j = 1; j <= b; j++) {
                            if (i > j) {
                                System.out.print(" ");
                            } else
                                System.out.print("*");
                        }
                        System.out.print("\n");

                    }
                    break;
                case 3:
                    System.out.println("Nhập Chiều Dài Cạnh: ");
                    int c = input.nextInt();
                    for (int i = 0; i <= c; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");

                    }
                    break;
                case 4:
                    System.out.println("Nhập Chiều Dài Cạnh: ");
                    int d = input.nextInt();
                    for (int i = 1; i <= d; i++) {
                        for (int j = d - i; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }


        }
    }
}


// VẼ TAM GIÁC VUÔNG GÓC DƯỚI BÊN TRÁI
//                    for (int i =0;i<=5;i++){
//                        for (int j =0;j<i;j++){
//                            System.out.print("*");
//                        }
//                        System.out.print("\n");
//
//                    }
// VẼ HÌNH VUÔNG
//        for (int i =1;i<=5;i++){
//            for (int j =1;j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//
//        }

// VẼ HÌNH TAM GIÁC VUÔNG GÓC TRÊN BÊN PHẢI
//        for (int i =1;i<=5;i++){
//            for (int j =1;j<=5;j++){
//                if (i>j){
//                    System.out.print(" ");
//                }else
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }
// VẼ TAM GIÁC VUÔNG TRÊN BÊN TRÁI
//        for (int i =5;i>=1;i--){
//            for (int j =1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

// VẼ TAM ĐỀU
//        for (int i =5;i>=1;i--){
//            for (int j =1;j<=5;j++) {
//                if (i<=j){
//                    System.out.print("*");
//                }
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

// VẼ TAM GIÁC VUÔNG GÓC DƯỚI BÊN PHẢI
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 5 - i; j >=1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//    }
//}
