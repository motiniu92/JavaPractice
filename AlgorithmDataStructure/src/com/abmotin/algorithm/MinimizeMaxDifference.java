package com.abmotin.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaxDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Difference Number: ");
        int k = input.nextInt();

        System.out.print("Enter Tower Point: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int modifiedArr[] = new int[n];

        System.out.print("Enter array value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int diff = 0;
            int add = arr[i] + k;
            int sub = arr[i] - k;
            if (add < 0) diff = sub;

            if (sub < 0) diff = add;

            if (add > 0 && sub > 0)
                if(add < sub) diff = add;
                else diff = sub;
            modifiedArr[i] = diff;
        }
        Arrays.sort(modifiedArr);
        System.out.println("Minimum difference: " + (modifiedArr[n-1] - modifiedArr[0]));
    }
}
