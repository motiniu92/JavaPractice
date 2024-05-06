package com.abmotin.array;

import java.util.Arrays;

public class SortingElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 5, 12, 20, 15};
        Arrays.sort(arr);
        System.out.println("Array element after sorting: " + Arrays.toString(arr));
    }
}
