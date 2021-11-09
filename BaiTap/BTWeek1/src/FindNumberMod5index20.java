import java.util.Scanner;

public class FindNumberMod5index20 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int count = 0;
        int n = 11;

        for (int i = n; count < 20; i++) {
            if (i % 5 == 0) {
                //  System.out.println(i);
                count++;
            }
            if (count == 20 && i % 5 == 0) {
                System.out.println("N ở Vi Tri 20,N % 5 == 0 La: " + i);
            }

        }

    }
}
