package com.abmotin.array;

public class FindSecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] array = {12, 13, 1, 10, 34, 10};
        int num = array.length;
        System.out.print("Second smallest element: " + secondSmallestElement(array, num));
    }

    private static int secondSmallestElement(int[] array, int num) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            if (array[i] < first) {
                second = first;
                first = array[i];
            } else if (second > array[i]) {
                second = array[i];
            }
        }

        return second;
    }
}
