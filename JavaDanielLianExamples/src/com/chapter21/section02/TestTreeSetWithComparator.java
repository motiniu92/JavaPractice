package com.chapter21.section02;

import com.chapter20.section05.Circle;
import com.chapter20.section05.GeometricObject;
import com.chapter20.section05.GeometricObjectComparator;
import com.chapter20.section05.Rectangle;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithComparator {

    public static void main(String[] args) {
         // Create a tree set for geometric objects using a comparator
         Set<GeometricObject> set =
                 new TreeSet<>(new GeometricObjectComparator());
         set.add(new Rectangle(4, 5));
         set.add(new Circle(40));
         set.add(new Circle(40));
         set.add(new Rectangle(4, 1));

         // Display geometric objects in the tree set
         System.out.println("A sorted set of geometric objects");
        for (GeometricObject element: set)
             System.out.println("area = " + element.getArea());
         }
}
