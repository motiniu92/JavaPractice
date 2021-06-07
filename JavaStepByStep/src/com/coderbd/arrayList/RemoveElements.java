package com.coderbd.arrayList;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Rasel");
        arrayList.add("Gafur");
        arrayList.add("Ajad");
        arrayList.add("Anamul");
        arrayList.add("Nasir");
        System.out.println("An initial list of elements: "+arrayList);
        System.out.println();

        //Removing specific element from arraylist
        arrayList.remove("Gafur");
        System.out.println("After invoking remove(object) method: "+arrayList);
        System.out.println();

        //Removing element on the basis of specific position
        arrayList.remove(0);
        System.out.println("After invoking remove(index) method: "+arrayList);
        System.out.println();

        //Creating another arraylist
        ArrayList<String> list=new ArrayList<String>();
        list.add("Jahid");
        list.add("Harun");

        //Adding new elements to arraylist
        arrayList.addAll(list);
        System.out.println("Updated list : "+arrayList);
        System.out.println();

        //Removing all the new elements from arraylist
        arrayList.removeAll(list);
        System.out.println("After invoking removeAll() method: "+arrayList);
        System.out.println();

        //Removing elements on the basis of specified condition
        arrayList.removeIf(str -> str.contains("Ajad"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+arrayList);
        System.out.println();

        //Removing all the elements available in the list
        arrayList.clear();
        System.out.println("After invoking clear() method: "+arrayList);
    }
}
