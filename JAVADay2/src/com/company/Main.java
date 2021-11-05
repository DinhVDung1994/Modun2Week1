package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Số Cần Kiểm Tra");
        int num = scanner.nextInt();


        if (num < 2) {
            System.out.println(num + " Không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " không là số nguyên tố");
            }
        }
    }
}
