import java.util.Arrays;
import java.util.Scanner;

public class DemSLSVThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập Độ Dài MẢng: ");
            size = scanner.nextInt();
            if (size>30){
                System.out.println("Độ Dài Mảng Không Quá 30");
            }
        }while (size>30);

        array = new int[size];
        int i= 0;
        while (i< array.length){
            System.out.print("Nhập Điểm Cho SV thứ "+(i+1)+" :");
            array[i]=scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh Sách Điểm: ");
        for (int x:array) {
            System.out.print(x+" ");
            if (x>=5 && x<=10){
                count++;
            }
        }
        System.out.println();
        System.out.println("Số SV Thi Đỗ Là: "+count);
    }
}
