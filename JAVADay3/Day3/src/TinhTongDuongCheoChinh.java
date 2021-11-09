public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,4,3},
                {5,8,6,4}
        };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng Đường Chéo Chính: "+sum);
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==arr[i].length-1-i){
                    sum1+=arr[i][j];
                    //System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("Tổng Đường Chéo Phụ: "+sum1);
    }
}
