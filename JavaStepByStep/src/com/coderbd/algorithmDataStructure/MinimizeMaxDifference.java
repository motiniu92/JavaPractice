package com.coderbd.algorithmDataStructure;

import java.util.Arrays;

public class MinimizeMaxDifference {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
       // int k = input.nextInt();
        int k = 2;
        //int n = input.nextInt();
        int n = 4;
        int arr[] = {1,6,8,10};
        int modifiedArr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
        for (int i = 0; i < arr.length; i++) {
            int diff = 0;
            int add = arr[i] + k;
            int sub = arr[i] - k;
            if (add < 0) diff = sub;
            if (sub < 0) diff = add;
            if (add > 0 && sub > 0)
                if (add < sub) diff = add;
                else diff = sub;
            modifiedArr[i] = diff;
        }
        Arrays.sort(modifiedArr);
        System.out.println("Minimum difference: " + (modifiedArr[n - 1] - modifiedArr[0]));
    }

}
