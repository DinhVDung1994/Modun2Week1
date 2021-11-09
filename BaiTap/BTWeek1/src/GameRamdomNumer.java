import java.util.Random;
import java.util.Scanner;

public class GameRamdomNumer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ramdom = (int)(Math.random()*9+1);
        System.out.println("Mời Bạn Nhập Số Từ 1 đến 10");

        while (true){
            int num = input.nextInt();
            if (num<0 || num>10) {
                System.out.println("Mời Bạn Nhập Lại Số Từ 1 đến 10");
            }
            if(num ==ramdom){
                System.out.println("You Win!!!");
                break;
            }else if (num>ramdom) {
                System.out.println("Thấp Xuống 1 Chút");
            }else {
                System.out.println("Cao Lên Chút");
            }
        }
    }
}
