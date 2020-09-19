package com.chapter20.section05;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New York");
        arrayList.add("Atlanta");
        arrayList.add("Dallas");
        arrayList.add("Madison");
        System.out.println("A list of cities in Collections : ");
        System.out.println(arrayList);

        System.out.println("\nIs Dallas in Collection? " + arrayList.contains("Dallas"));

        arrayList.remove("Dallas");
        System.out.println("\n" + arrayList.size() +
                " cities are in collection now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);


        ArrayList<String> c1 = (ArrayList<String>)(arrayList.clone());
         c1.addAll(collection2);
         System.out.println("\nCities in collection1 or collection2: ");
         System.out.println(c1);

         c1 = (ArrayList<String>)(arrayList.clone());
         c1.retainAll(collection2);
         System.out.print("\nCities in collection1 and collection2: ");
         System.out.println(c1);

         c1 = (ArrayList<String>)(arrayList.clone());
         c1.removeAll(collection2);
         System.out.print("\nCities in collection1, but not in 2: ");
         System.out.println(c1);


    }
}
