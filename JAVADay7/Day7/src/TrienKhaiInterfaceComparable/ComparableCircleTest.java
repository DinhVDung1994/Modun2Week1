package TrienKhaiInterfaceComparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5);

        System.out.println("Truoc Khi Sap Xep: ");
        for (ComparableCircle x:circles) {
            System.out.println(x);
        }

        Arrays.sort(circles);

        System.out.println("Sau Khi Sap Xep: ");
        for (ComparableCircle x:circles) {
            System.out.println(x);
        }
    }
}
