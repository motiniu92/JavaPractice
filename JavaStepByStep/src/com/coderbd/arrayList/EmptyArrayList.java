package com.coderbd.arrayList;

import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + arrayList.isEmpty());
        arrayList.add("Rajib");
        arrayList.add("Kajem");
        arrayList.add("Ajad");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: " + arrayList.isEmpty());
    }
}
