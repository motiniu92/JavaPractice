package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // add to the collection
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Delas");
        collection.add("Madision");
        System.out.println();

        // check if there is element in collection
        // Iterator
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase()+ " ");
        }
        System.out.println();

    }
}
