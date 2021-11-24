package MoTaThuatToanSapXepChen;

import java.util.Scanner;

public class MoTaSapXepChen {
    public static void main(String[] args) {
        // Yêu cầu nhập độ dài của mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Độ Dài Mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        // Nhập giá trị các phần tử từ bàn phím
        System.out.println("Nhập giá trị các phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        // Xuất mảng vừa nhập
        System.out.print("Mảng Vừa Nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"  ");
        }
        // Tiến hành Sắp Xếp
        System.out.println();
        insertionSort(arr);
    }

    public static void insertionSort(int[] array){
        int pos,x;
        boolean needNextPass = true;
        for (int k = 1; k < array.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + array[i] + " with " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needNextPass = true; /* Next pass still needed */
                }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();

        }
}
}
