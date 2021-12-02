package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle1[] circle1 = new Circle1[3];
        circle1[0] = new Circle1(3.6);
        circle1[1] = new Circle1();
        circle1[2] = new Circle1(3.5);

        System.out.println("Truoc Khi Sap Xep: ");
        for (Circle1 x:circle1) {
            System.out.println(x);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle1, circleComparator);

        System.out.println("Sau Khi Sap Xep:");
        for (Circle1 x:circle1 ) {
            System.out.println(x);
        }
    }
}
