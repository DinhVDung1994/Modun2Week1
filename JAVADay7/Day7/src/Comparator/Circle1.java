package Comparator;

public class Circle1 {
    private double radius =1.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius ="
                + getRadius()
                +" : Area ="
                +getArea()
                +" : Perimeter = "
                +getPerimeter();
    }
}