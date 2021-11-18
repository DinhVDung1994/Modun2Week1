package DaoChuoi;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);

        for (int i=0;i<myStack.size();i++){
            System.out.print(myStack.get(i)+" ");
        }
        System.out.println();
        int[] arr = new int[myStack.size()];




    }
}
