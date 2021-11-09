public class TimMinTrongArray {
    public static void main(String[] args) {
        int[] arr = {8,5,6,4,9,3,5,-5,3,1,5,-8,-1};
        int min = FindMin(arr);
        System.out.println(arr[min]);

    }
    public static int FindMin(int[] array){
        int index = 0;
        for (int i = 1;i<array.length;i++) {
            if (array[index] > array[i]) {
                array[index] = array[i];
                index = i;
            }
        }
        return index;
    }
}

