import java.util.Scanner;

public class TestKeyIsprime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = 5;
        int b = 10;
        int tonga = (a+b)-a;
        System.out.println(tonga);
        int tongb = (a+b)-b;
        System.out.println(tongb);

//        System.out.print("Nhập Vào Số Cần Kiểm Tra: ");
//        int num = number.nextInt();
//
//        if (num<2){
//            System.out.println("Không Phải Là SNT");
//        }else {
//            boolean check = true;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check) {
//                System.out.println(num + " Là SNT");
//            } else {
//                System.out.println(num + " Không Phải Là SNT");
//            }
//        }
    }
}
