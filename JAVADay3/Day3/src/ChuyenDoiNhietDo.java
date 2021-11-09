import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int num;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            num = sc.nextInt();

            switch (num) {
                case 1:{
                    System.out.println("Nhập Nhiệt Độ Fahrenheit Muốn Chuyển: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + " Độ F = " + ((5.0 / 9) * (fahrenheit - 32)) + "Độ C");
                    break;
            }
                case 2: {
                    System.out.println("Nhập Nhiệt Độ Celsius Muốn Chuyển: ");
                    celsius = sc.nextDouble();
                    System.out.println(celsius + " Độ C = " + ((9.0 / 5) * celsius + 32) + "Độ F");
                    break;
                }
                case 0:
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Nhập Đúng Chỉ Mục Menu Đã Cho");
                    break;
                }
            }

        } while (num !=0);
    }
}
