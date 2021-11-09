import java.util.Scanner;

public class TinhTongGiaTriCotTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,4,3},
                {5,8,6,4}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Giá Trị Cột Bạn Muốn Tính Tổng: ");
        int value = sc.nextInt();

        System.out.println("Tổng: "+getSum(arr,value));
    }
    public static int getSum(int[][] array,int cols){
        int sum = 0;
        for (int i = 0;i< array.length;i++){
            sum = sum+array[i][cols-1];
            //System.out.println(sum);
        }
        return sum;
    }
}
