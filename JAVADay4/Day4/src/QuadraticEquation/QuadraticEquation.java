package QuadraticEquation;

import Fan.Main;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
//    private double delta;
//    private double r1;
//    private double r2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return ((-b) - Math.sqrt(getDiscriminant()))/2*a;
    }
    public double getRoot2(){
        return ((-b) + Math.sqrt(getDiscriminant()))/2*a;
    }
    public double getRoot3(){
        return -b/2*a;
    }
}
