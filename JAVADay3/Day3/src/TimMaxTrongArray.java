import java.util.Scanner;

public class TimMaxTrongArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,8,6,9,7,4,5,1,8,6,9};
        int max = arr[0];
        int max1 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max =arr[i];
                max1 = max;
            }
        }

      //  int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max1==arr[i]){
                count++;
                System.out.println("Vị Trí xuất hiện lần "+count+" của giá trị lớn nhất là");
                System.out.println("Vị Trí thứ :"+(i+1));
                //index = i;
            }

        }
        System.out.println("Giá Trị Lơn Nhất là : "+max1+", Xuất hiện "+count+" lần");
    }
}
