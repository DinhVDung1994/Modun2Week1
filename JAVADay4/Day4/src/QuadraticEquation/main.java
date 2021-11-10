package QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuadraticEquation pt13 = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        pt13.setA(sc.nextDouble());
        System.out.println("Nhập b");
        pt13.setB(sc.nextDouble());
        System.out.println("Nhập c");
        pt13.setC(sc.nextDouble());

        if (pt13.getDiscriminant()>0){
            System.out.println(pt13.getRoot1());
            System.out.println(pt13.getRoot2());
        }else if (pt13.getDiscriminant()==0){
            System.out.println(pt13.getRoot3());
        }else {
            System.out.println("PT Vô Nghiệm");
        }

        // PT sử dụng constructor khuyết nhập bằng sét
        QuadraticEquation pt1 = new QuadraticEquation();
        pt1.setA(1);
        pt1.setB(2.0);
        pt1.setC(1);

        if (pt1.getDiscriminant()>0){
            System.out.println(pt1.getRoot1());
            System.out.println(pt1.getRoot2());
        }else if (pt1.getDiscriminant()==0){
            System.out.println(pt1.getRoot3());
        }else {
            System.out.println("PT Vô Nghiệm");
        }
// PT Nhập bằng constructor đầy đủ tham số
        QuadraticEquation gpt2 = new QuadraticEquation(1.0,3,1);
        System.out.println(gpt2.getDiscriminant());
        if (gpt2.getDiscriminant()>0){
            System.out.println(gpt2.getRoot1());
            System.out.println(gpt2.getRoot2());
        }else if (gpt2.getDiscriminant()==0){
            System.out.println(gpt2.getRoot3());
        }else {
            System.out.println("PT Vô Nghiệm");
        }
    }
}
