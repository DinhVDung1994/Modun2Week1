package RefactoringMenthod;

import java.util.Scanner;

public class RefactoringMenthod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Bán Kính: ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập Chiều Cao: ");
            int num2 = Integer.parseInt(sc.nextLine());
        while (true){
        System.out.println("=========Menu========");
        System.out.println("1. Tính Diện Tích Đáy");
        System.out.println("2. Tính Chu Vi");
        System.out.println("3. Tính Thể Tích");
        System.out.println("0. Thoát Ứng Dụng");
        int choise = Integer.parseInt(sc.nextLine());

            switch (choise){
                case 1:
                    System.out.println("Diện Tích Đáy Là: "+Cylin.getVolume(num1,num2));
                    break;
                case 2:
                    System.out.println("Chu Vi Là: "+Cylin.getBaseArea(num1));
                    break;
                case 3:
                    System.out.println("Thể Tích Là: "+Cylin.getPermimeter(num1));
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
    public static class Cylin {
        public static double getVolume(int radius, int height) {
            double baseArea = getBaseArea(radius);
            double permimeter = getPermimeter(radius);
            double volume = permimeter * height + 2 * baseArea;
            return volume;
        }

        public static double getBaseArea(int radius) {

            return Math.PI * radius * radius;
        }

        public static double getPermimeter(int radius) {

            return 2 * Math.PI * radius;
        }
    }
}
