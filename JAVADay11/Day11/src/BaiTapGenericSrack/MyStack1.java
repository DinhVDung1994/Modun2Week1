package BaiTapGenericSrack;

import java.util.LinkedList;
import java.util.Scanner;

public class MyStack1<E> {
    private E [] elements;
    private int size;

    public MyStack1() {
    }

    public void add(E e){
        elements = (E[]) new Object[++size];
      for (int i=0;i<elements.length;i++){
          elements[i] = e;
          System.out.println(elements[i]);
      }

    }

    public E pop() {
        MyStack1[] element1 = new MyStack1[elements.length-1];
        for (int i =0;i<elements.length-1;i++){
            element1[i] = (MyStack1) elements[i];
        }
        return (E) element1;
    }

    public E get(){
       for (int i = 0;i<elements.length;i++){
           System.out.println(elements[elements.length]);
       }
       return elements[elements.length];
    }

    public boolean isEmpty(){
        boolean check = false;
        for (int i = 0;i<elements.length;i++) {
            if (elements[i] == null) {
                check = true;
            }
        }
        return check;
    }
    public void show(){
        for (int i =0;i<elements.length;i++){
            System.out.println(elements[i]+" ");
        }
    }

    public static void main(String[] args) {
        MyStack1<Integer> st = new MyStack1();
        Scanner sc = new Scanner(System.in);
        st.add(5);
        st.add(15);
        st.add(35);
      //  st.show();



    }

}
