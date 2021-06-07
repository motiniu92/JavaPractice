package com.coderbd.arrayList;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        System.out.println("Initial list of elements: "+arrayList);

        //Adding elements to the end of the list
        arrayList.add("Rakib");
        arrayList.add("Hasan");
        arrayList.add("Rahim");
        System.out.println("After invoking add(E e) method: "+arrayList);

        //Adding an element at the specific position
        arrayList.add(1, "Sihab");
        System.out.println("After invoking add(int index, E element) method: "+arrayList);
        ArrayList<String> list=new ArrayList<String>();
        list.add("Sajib");
        list.add("Rayhan");

        //Adding second list elements to the first list
        arrayList.addAll(list);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+arrayList);
        ArrayList<String> arrays=new ArrayList<String>();
        arrays.add("Farhad");
        arrays.add("Ruhul");
        //Adding second list elements to the first list at specific position
        arrayList.addAll(1, arrays);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+arrayList);

    }
}
