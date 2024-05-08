package com.abmotin.array;

import java.util.ArrayList;

public class FindFisrtElementInArray {
    public static void main(String[] args) {
        int[] array = {6, 2, 1, 7, 5, 3, 8, 9, 10, 4};
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Convert the array to ArrayList
        for (int i : array) {
            arrayList.add(i);
        }

        int firstElement = arrayList.get(0);
        System.out.println("First Element: " + firstElement);
    }
}
