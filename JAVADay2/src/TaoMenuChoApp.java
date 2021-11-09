import java.util.Scanner;

public class TaoMenuChoApp {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ Hình Tam Giác");
        System.out.println("2. Vẽ Hình Vuông");
        System.out.println("3. Vẽ Hình Chữ Nhật");
        System.out.println("0. Exit");
        System.out.println("Enter Your Choice");
        while (true) {
            int choice = number.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ Hình Tam Giác ");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ Hình Vuông ");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Vẽ Hình Chữ Nhât ");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không Có Dữ Liệu");

            }
        }
    }
}
