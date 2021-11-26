package NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập X: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Y: ");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x,int y){
        try{
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng x + y = "+a);
            System.out.println("Tổng x - y = "+b);
            System.out.println("Tổng x * y = "+c);
            System.out.println("Tổng x / y = "+d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: "+e.getMessage());
        }
    }
}
