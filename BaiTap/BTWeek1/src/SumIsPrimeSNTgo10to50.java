import java.util.Scanner;

public class SumIsPrimeSNTgo10to50 {
    public static void main(String[] args) {

        Scanner sumIsprime = new Scanner(System.in);

        int sum = 0;
        for (int i = 10; i <= 50; i++) {
            boolean check = true;
            for (int j =2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
               // System.out.println("Các Số NT trong khoảng từ 10 đến 50 là: "+i);
                sum = sum + i;
            }
        }
        System.out.println("Tổng các SNT trên là: "+sum);
    }
}
