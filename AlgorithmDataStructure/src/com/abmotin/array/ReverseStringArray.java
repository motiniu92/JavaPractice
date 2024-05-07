package com.abmotin.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] stringsArray = {"one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"};
        System.out.println("Original Array:" + Arrays.asList(stringsArray));
        // creating new method
        reverseElementsOfArray(stringsArray);

        System.out.println("Original Array:");
        for (String s : stringsArray) {
            System.out.print(s + " , ");
        }
        // creating new method
        reverseStringArray(stringsArray, stringsArray.length);
    }

    private static void reverseStringArray(String[] stringsArray, int num) {
        String[] dest_array = new String[num];
        int j = num;
        for (int i = 0; i < num; i++) {
            dest_array[j - 1] = stringsArray[i];
            j = j - 1;
        }

        System.out.println();
        System.out.println("Reversed array: ");
        for (int k = 0; k < num; k++) {
            System.out.print(dest_array[k] + " , ");
        }
    }

    private static void reverseElementsOfArray(String[] myArray) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
}
