package com.coderbd.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExamples {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Khalid");
        arrayList.add("Hasan");
        arrayList.add("Majid");
        arrayList.add("Sajid");
        arrayList.add("Rakib");

        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.println("Traversing elements in forward direction");

        while (listIterator.hasNext()) {
            System.out.println("index : " + listIterator.nextIndex() + "value : " + listIterator.next());
        }

        System.out.println("Traversing elements in backward direction");
        while (listIterator.hasPrevious()) {
            System.out.println("index : " + listIterator.previousIndex() + "value : " + listIterator.previous());
        }
    }
}
