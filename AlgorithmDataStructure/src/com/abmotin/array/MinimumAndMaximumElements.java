package com.abmotin.array;


public class MinimumAndMaximumElements {
    public static void main(String[] args) {
        int[] array = {12, 1234, 45, 67, 1};
        int num = array.length;
        System.out.println("Minimum element of array: " + getMin(array, num));
        System.out.println("Maximum element of array: " + getMax(array, num));
    }

    private static int getMin(int[] array, int num) {
        int res = array[0];
        for (int i = 1; i < num; i++)
            res = Math.min(res, array[i]);
        return res;
    }

    private static int getMax(int[] array, int num) {
        int res = array[0];
        for (int i = 1; i < num; i++)
            res = Math.max(res, array[i]);
        return res;
    }

}
