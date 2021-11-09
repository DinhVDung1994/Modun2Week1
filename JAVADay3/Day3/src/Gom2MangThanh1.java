public class Gom2MangThanh1 {
    public static void main(String[] args) {
        int[] array1 = {7,5,8,6,1,4,-5};
        int[] array2 = {9,4,36,15,0,0};
        int[] array3 =new int[array1.length+array2.length];
        int k =0;
        for (int i = 0; i < array1.length; i++) {
            array3[k]=array1[i];
            k++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[k]=array2[i];
            k++;
        }
        System.out.print("Mảng Sau Khi Gộp: ");
        for (int element:array3) {
            System.out.print(element+" ");
        }

    }
}
