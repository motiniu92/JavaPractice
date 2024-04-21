package com.abmotin.addTwoNumbers;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Input two number: ");
        Scanner scan = new Scanner(System.in);
        int numOne, numTwo, sum;

        numOne = scan.nextInt();
        numTwo = scan.nextInt();
        sum = numOne + numTwo;

        System.out.println("Sum..: "+sum);
    }

}
