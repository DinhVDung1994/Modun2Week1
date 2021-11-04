import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;

        System.out.print("Nhập Số Tiền Muốn Chuyển Đổi: ");
        float moneyUSD = scanner.nextInt();

        float moneyVND = moneyUSD * rate;
        System.out.println(moneyUSD+"$ : Đổi Được :"+moneyVND+" vnđ");
    }
}
