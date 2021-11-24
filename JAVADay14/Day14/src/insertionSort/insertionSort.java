package insertionSort;

public class insertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
                x = array[i];
                pos = i;
                while (pos >0 && x<array[pos-1]){
                    array[pos] = array[pos-1];
                    pos--;
                }
                array[pos] = x;
            }
        System.out.print("Mảng Sau Khi Sắp Xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
