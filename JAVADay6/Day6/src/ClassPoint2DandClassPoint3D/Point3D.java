package ClassPoint2DandClassPoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D: "
                +"("+getX()+" ,"+getY()+" ,"+getZ()+")";
    }
    public static class Point3DTest{
        public static void main(String[] args) {
            Point2D point2D = new Point3D();
            point2D = new Point3D(3,5,8);
            System.out.println(point2D);
        }
    }
}
