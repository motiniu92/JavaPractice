package com.coderbd.list;

import java.util.ArrayList;
import java.util.List;

public class GetAndSetElements {
    public static void main(String[] args) {
        // Creating a List
        List<String> list = new ArrayList<String>();

        // Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // accessing the elements
        System.out.println("Returning element :" + list.get(1));

        // Changing the element
        list.set(1, "Dates");

        // Iterating the list element using for each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
