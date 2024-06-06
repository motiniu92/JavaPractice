package com.abmotin.array;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonIntegersElementsTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 8, 9, 7, 10, 0};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 2, 12};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        HashSet set = new HashSet();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == (array2[j])) {
                    set.add(array1[i]);
                }
            }
        }

        System.out.println("Common element is : " + set);
    }
}
