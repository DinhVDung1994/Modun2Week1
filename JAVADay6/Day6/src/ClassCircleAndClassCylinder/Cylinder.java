package ClassCircleAndClassCylinder;

public class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getTheTich(){
        return chieuCao*getArea();
    }

    @Override
    public String toString() {
        return "Hinh Tru co Chieu Cao: "
                +chieuCao
                +", Co TheTich La: "
                +getTheTich()
                +" Mau: "+getColor();
    }

    public static class CylinderTest{
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder(8);
            System.out.println(cylinder);

            cylinder = new Cylinder(5,"Red",8);
            System.out.println(cylinder);
        }
    }
}
