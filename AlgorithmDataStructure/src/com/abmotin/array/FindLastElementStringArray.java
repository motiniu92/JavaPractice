package com.abmotin.array;

import java.util.ArrayList;

public class FindLastElementStringArray {
    public static void main(String[] args) {

        String[] cars = {"Java", "Php", "Android", "Flutter", "JavaScript", "Dart", "MySql"};
        ArrayList<String> arrayList = new ArrayList<>();

        // Convert the array to ArrayList
        for (String i : cars) {
            arrayList.add(i);
        }

        String lastElement = arrayList.get(arrayList.size() - 1);
        System.out.println("Last Element: " + lastElement);
    }
}
