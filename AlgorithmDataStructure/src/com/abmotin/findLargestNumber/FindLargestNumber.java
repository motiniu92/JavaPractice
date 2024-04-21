package com.abmotin.findLargestNumber;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        System.out.println("Input three number values: ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int largestNumber = 0;

        if (num1 > num2) {
            if (num1 > num3) {
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }

        } else {

            if (num2 > num3) {
                largestNumber = num2;
            } else {
                largestNumber = num3;
            }
        }

        System.out.println("Largest number is: " + largestNumber);
    }
}
