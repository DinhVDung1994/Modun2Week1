import java.util.Arrays;
import java.util.Scanner;

public class DemGiaTriXuatHienTrongMang {
    public static void main(String[] args) {
        String str = "hdhdjksjdjladjs";
        String[] arr = str.split("");
        System.out.print("Mảng Ban Đầu: ");
        System.out.print(Arrays.toString(arr));

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Giá Trị Muốn Đếm Trong Mảng: ");
        String value = sc.nextLine();

        int count =0;
        for (String x:arr) {
            if (value.equals(x)){
                count++;
            }
        }
        System.out.println("Giá Trị "+value+" Xuất Hiện : "+count+" Lần");
    }
}
