import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a :");
        int a = sc.nextInt();
        System.out.print("Nhập b :");
        int b = sc.nextInt();
        System.out.print("Nhập c :");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta == 0) {
            System.out.println("PT có 2 nghiệm kép : X1=X2= " + -b / 2 * a);
        } else if (delta < 0) {
            System.out.println("PT Vố Nghiệm");
        } else {
            System.out.println("PT Có 2 Nghiệm Phân biệt:");
            System.out.println("X1 = " + (-b + Math.sqrt(delta) / 2 * a));
            System.out.println("X2 = " + (-b - Math.sqrt(delta) / 2 * a));
        }
    }
}
