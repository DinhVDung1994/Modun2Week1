import java.util.Scanner;

public class GameAiLaNghinphu {
    public static void main(String[] args) {
        System.out.println("Lớp C0921K1 Có Bao Nhiêu Bạn Nam");
        System.out.println("1. 1 Bạn");
        System.out.println("2. 2 Bạn");
        System.out.println("3. 3 Bạn");
        System.out.println("4. 4 Bạn");

        Scanner sc = new Scanner(System.in);
        boolean check = true;

        while (check){// dùng whiel đặt điều kiện sai nhập lại với biến check
            System.out.println("Nhập Đáp Án");
            int DapAn = sc.nextInt();

            switch (DapAn){
                case 1:
                case 2:
                case 4:
                    System.out.println("Đáp Án Không Đúng");
                    break;
                case 3:
                    System.out.println("You Win!!!");
                    check = false;//khi check = false while sẽ dừng chương trình
                    break;
            }
        }
    }
}
