package com.abmotin.smallestNumber;

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a b c : ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int smallestNumber = 0;
        if (a < b) {
            //  smallestNumber = Math.min(a, c);
            if (a > c) {
                smallestNumber = c;
            } else {
                smallestNumber = a;
            }

        } else {
            // smallestNumber = Math.min(b, c);
            if (b > c) {
                smallestNumber = c;
            } else {
                smallestNumber = b;
            }
        }
        System.out.println("Smallest number is: " + smallestNumber);
    }
}
