package ClassCircleAndClassCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh Tron BanKinh:"
                +radius
                +", Co Mau: "
                +color
                +", Co DienTich La: "
                +getArea();
    }

    public static class CircleTest{
        public static void main(String[] args) {
            Circle circle = new Circle();
            circle = new Circle(5,"Pink");
            System.out.println(circle);

            circle = new Circle(2,"Gray");
            System.out.println(circle);
        }
    }
}
