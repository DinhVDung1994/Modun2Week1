package Rectangle;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập Chiều Dài: ");
            double width = input.nextDouble();
            System.out.print("Nhập Chiều Rộng: ");
            double height = input.nextDouble();

            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Your Rectangle.Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle.Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle.Rectangle: "+ rectangle.getArea());
        }
}
