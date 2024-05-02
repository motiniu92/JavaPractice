package com.abmotin.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        Integer[] arr = {12, 35, 1, 10, 34, 1};
        int num = arr.length;
        printSecondlargest(arr, num);
    }

    private static void printSecondlargest(Integer[] arr, int arr_size) {

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 1; i < arr_size; i++) {

            if (!Objects.equals(arr[i], arr[0])) {
                System.out.printf("The second largest "
                                + "element is %d\n",
                        arr[i]);
                return;
            }
        }

        System.out.print("There is no second "
                + "largest element\n");
    }
}
