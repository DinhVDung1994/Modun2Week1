import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class operatorexample {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập Chiều Dài: ");
        width = scanner.nextFloat();

        System.out.println("Nhập Chiều Rộng: ");
        height = scanner.nextFloat();

        float area = width*height;

        System.out.println("Diện Tích : "+ area);
    }
}
