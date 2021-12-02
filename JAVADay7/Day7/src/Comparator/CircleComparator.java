package Comparator;

import TrienKhaiInterfaceComparable.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle1> {
    @Override
    public int compare(Circle1 o1, Circle1 o2) {
        if (o1.getRadius()>o2.getRadius()){
            return 1;
        }else if (o1.getRadius()<o2.getRadius()){
            return -1;
        }else  return 0;
    }
}
