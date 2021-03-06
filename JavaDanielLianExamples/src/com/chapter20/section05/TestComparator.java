package com.chapter20.section05;

import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Rectangle(5,3);
        GeometricObject geometricObject2 = new Circle(5);

        GeometricObject geometricObject = max(geometricObject1,geometricObject2,new GeometricObjectComparator());
        System.out.println("The area of the larger object is "+ geometricObject.getArea());

    }

    public static GeometricObject max(GeometricObject geometricObject1, GeometricObject geometricObject2, Comparator<GeometricObject> comparator) {

    if(comparator.compare(geometricObject1,geometricObject2)>0) return geometricObject1;
        else return geometricObject2;
    }
}
