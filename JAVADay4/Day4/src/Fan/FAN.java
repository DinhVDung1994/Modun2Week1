package Fan;

public class FAN {
    private static final int Slow = 1;
    private static final int Medium = 2;
    private static final int Fast = 3;

    private int Speed = FAN.Slow;
    private boolean On = false;
    private double radius = 5.0;
    private String color = "Blue";

    public FAN() {
    }

    public FAN(int speed, boolean on, double radius, String color) {
        Speed = speed;
        On = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FAN{" +
                "Speed=" + Speed +
                ", On=" + On +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
