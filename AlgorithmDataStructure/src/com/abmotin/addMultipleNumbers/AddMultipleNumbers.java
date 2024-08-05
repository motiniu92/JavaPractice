package com.abmotin.addMultipleNumbers;

import java.util.Scanner;

public class AddMultipleNumbers {
    public static void main(String[] args) {
        System.out.println("Input three number: ");
        Scanner scan = new Scanner(System.in);
        int numOne, numTwo, numThree, sum;

        numOne = scan.nextInt();
        numTwo = scan.nextInt();
        numThree = scan.nextInt();
        sum = numOne + numTwo + numThree;

        System.out.println("Sum..: "+sum);
    }
}
