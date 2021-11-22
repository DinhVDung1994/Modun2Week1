package ClassPointAndMoveablePoint;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){}

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array ={this.xSpeed,this.ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public float getY() {
        return super.getY();
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }
    public MoveablePoint move(MoveablePoint movablePoint) {
        movablePoint.setX(movablePoint.getX() + xSpeed);
        movablePoint.setY(movablePoint.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint;
        moveablePoint = new MoveablePoint(80,50);
        System.out.println(moveablePoint.move(moveablePoint));
    }
}
