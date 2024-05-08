package com.abmotin.array;

import java.util.ArrayList;
import java.util.Collections;

public class FindFirstElementStringArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Honda"};
        ArrayList<String> arrayList = new ArrayList<>();

        for (String car : cars) {
            arrayList.add(car);
        }
        String firstElement = arrayList.get(0);
        System.out.println("First Element: " + firstElement);

        stringFirstElement();
    }

    private static void stringFirstElement() {
        // used Collections
        String[] cars = {"Java", "Php", "Android", "Flutter", "JavaScript", "Dart", "MySql"};
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, cars);
        String firstStringElement = arrayList.get(0);
        System.out.println("First String Element: " + firstStringElement);
    }
}
