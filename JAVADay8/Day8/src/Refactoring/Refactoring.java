package Refactoring;

import java.util.Scanner;

public class Refactoring {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số A: ");
        int numberA = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Số B: ");
        int numberB = Integer.parseInt(sc.nextLine());

        System.out.println("Kết Quả: "+calculate(numberA,numberB,'+'));
    }
    public static final char ADDITION='+';
    public static final char SUNTRACTION='-';
    public static final char MULTIPLICATION='*';
    public static final char DIVISION='/';
    public static int calculate(int firstOperand, int secondOperand, char operator){
        switch (operator){
            case ADDITION:
                return  firstOperand + secondOperand;
            case SUNTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case  DIVISION:
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Can not divide by 0");
                }
            default:
                throw  new RuntimeException("Unsupported operation");
        }
    }
}
