import java.util.Scanner;

public class TimPhanTuTrongMang {
    public static void main(String[] args) {

//        String str = "abcxyzabcasa";
//        String[] arr = str.split("");
        String[] arr = {"Dung","Luc","Son","Long","Hoa","Anh"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên SV : ");
        String inputName = sc.nextLine();

        boolean isExist = true;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(inputName)){
                count++;
                System.out.println("SV "+inputName+" Có Tên Trong Mảng, Nằm Ở Vị Trí Thứ: "+(i+1));
                isExist = false;
            }
        }
        if (isExist){
            System.out.println("SV "+inputName+" Không Có Tên Trong Mảng");
        }
        System.out.println(count);
    }
}
