package HeCacDoiTuongHinhHoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                +getRadius()+", Which is a subclass of"
                + super.toString();
    }
    public static class CircleTest{
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(2.5);
            System.out.println(circle);

            circle = new Circle("indigo",false,3.5);
            System.out.println(circle);
        }
    }
}
