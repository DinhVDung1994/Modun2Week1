package Triangle;

public class Shape {
    private String color;
    private boolean fillder;

    public Shape(){}
    public Shape(String color,boolean fillder){
        this.color = color;
        this.fillder = fillder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillder() {
        return fillder;
    }

    public void setFillder(boolean fillder) {
        this.fillder = fillder;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fillder=" + fillder +
                '}';
    }
}
