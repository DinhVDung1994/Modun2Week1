import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisbleBy4 = year % 4 ==0;
        if (isDivisbleBy4){
            boolean isDivisbleBy100 =year % 100 ==0;
            if (isDivisbleBy100){
                boolean isDivisbleBy400 = year % 400 ==0;
                if (isDivisbleBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d is a leap year",year);
        }else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}