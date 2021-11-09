import java.util.Scanner;

public class readnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập Số Muốn Đọc: ");
        int number = scanner.nextInt();
        if (number>=10 && number<20){
            int doc=number %10;
            switch (doc){
                case 0:
                    System.out.println("tens");
                    break;
                case 1:
                    System.out.println("eleventh");
                    break;
                case 2:
                    System.out.println("Twelfth");
                    break;
                case 3:
                    System.out.println("Thirteenth");
                    break;
                case 4:
                    System.out.println("Fourteenth");
                    break;
                case 5:
                    System.out.println("Fifteenth");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("eightteen");
                    break;
                case 9:
                    System.out.println("niceteen");
                    break;
                default:
                    System.out.println("Out Of Ability");
                    break;
            }
        }else {
            System.out.println("Số Lớn Quá");
        }
    }
}
