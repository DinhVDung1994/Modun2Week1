import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DaoViTriTrongMang {
    public static void main(String[] args) {
        //KHAI BÁO VÀ KIỂM TRA KÍCH THƯỚC MẢNG
        int size;
        int [] array;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.print("Nhập Vào Kích Thước Mảng: ");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Kích Thước Mảng Không Quá 20");
            }
        }while (size>20);
        // NHẬP GIÁ TRỊ CHO CÁC PHẦN TỬ TRONG MẢNG
        array = new int[size];
        int i =0;
        while (i<array.length) {
            System.out.print("Nhập Giá Trị Thứ " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        //XUẤT MẢNG VỪA NHẬP
        System.out.printf("%-20s%s","Mảng Sau Khi Nhập Là :","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+",");
        }
        // TIẾN HÀNH ĐẢO VỊ TRÍ CÁC PHẦN TỬ TRONG MẢNG
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        // XUẤT MẢNG SAU KHI ĐẢO PHẦN TỬ
        System.out.printf("\n%-20s%s","Mảng Sau Khi Đảo: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+ ", ");
        }
    }
}
