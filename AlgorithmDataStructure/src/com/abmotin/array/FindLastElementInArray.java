package com.abmotin.array;

import java.util.ArrayList;

public class FindLastElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 2, 10, 3, 1, 8, 6, 7, 5, 9, 4};
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Convert the array to ArrayList
        for (int i : array) {
            arrayList.add(i);
        }

        int lastElement = arrayList.get(arrayList.size() - 1);
        System.out.println("Last Element: " + lastElement);
    }
}
