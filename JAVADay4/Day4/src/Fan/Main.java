package Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FAN Fan1 = new FAN();
        FAN Fan2 = new FAN();

        Fan1 = new FAN();
        Fan2.setSpeed(2);
        Fan2.setColor("Red");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());

    }
}
