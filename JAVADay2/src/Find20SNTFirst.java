import java.util.Scanner;

public class Find20SNTFirst {
    public static void main(String[] args) {
        Scanner inpunt = new Scanner(System.in);
        System.out.println("Nhập Số Lượng SNT Muốn Hiện");
        int num = inpunt.nextInt();
        int count = 0;
        for (int i = 2; count < num; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
        }
    }
}
