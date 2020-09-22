package com.excersize20;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Example20_10 {
    public static void main(String[] args) {
        String[] s1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] s2 = {"George", "Katie", "Kevin", "Michael", "Ryan"};
        PriorityQueue<String> p1 = new PriorityQueue<>(Arrays.asList(s1));
        PriorityQueue<String> p2 = new PriorityQueue<>(Arrays.asList(s2));

        // Union
        p2.addAll(p1);
        System.out.println("Union : " + p2);
        p2 = new PriorityQueue<>(Arrays.asList(s2));

        // Difference
        PriorityQueue<String> d = new PriorityQueue<>();
        p2.removeAll(p1);
        d.addAll(p2);

        p2 = new PriorityQueue<>(Arrays.asList(s2));
        p1.removeAll(p2);
        d.addAll(p1);
        System.out.println("Difference : " + d);
        p1 = new PriorityQueue<>(Arrays.asList(s1));

        // Intersection
        p2.retainAll(p1);
        System.out.println("Intersection : " + p2);

    }
}
