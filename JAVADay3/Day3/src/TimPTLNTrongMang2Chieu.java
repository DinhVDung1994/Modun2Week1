public class TimPTLNTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr ={
                {1,5,8,9},
                {5,6,96,7},
                {2,5,8,66}
        };
            int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
