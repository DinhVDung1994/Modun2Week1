import java.util.Scanner;

public class ThemPTVaoMang {
    public static void main(String[] args) {
        int[] array = new int[15];
        int n= 7;
        for (int i = 0; i < n; i++) {
            array[i]=i+1;
        }
        System.out.print("Mảng Ban Đầu: ");
        for (int element : array) {
            System.out.print(element+" ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Giá Trị Phần Tử Muốn Thêm: ");
        int number = input.nextInt();
        System.out.print("Nhập Vị Trí Phần Tử Muốn Thêm: ");
        int indexNum = input.nextInt();

        System.out.println();
        for (int i = n; i >indexNum; i--) {
            array[i]=array[i-1];
        }array[indexNum]=number;

        System.out.print("Mảng Sau Khi Chèn: ");
        for (int element : array) {
            System.out.print(element + " ");

        }

    }
}
