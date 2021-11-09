import java.util.Scanner;

public class totalBanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        System.out.print("Nhập Số Tiền Gửi: ");
        money = input.nextDouble();
        System.out.print("Nhập Số Tháng Vay: ");
        month = input.nextInt();
        System.out.print("Nhập vào lãi xuất: ");
        rate = input.nextDouble();

        double totalRate = 0;
        for (int i = 0; i < month; i++) {
            totalRate += money * (rate / 100) / 12 * month;
        }
        System.out.println("Lãi Xuất: " + totalRate);
    }
}
