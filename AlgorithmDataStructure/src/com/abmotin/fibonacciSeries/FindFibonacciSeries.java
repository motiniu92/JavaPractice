package com.abmotin.fibonacciSeries;

import java.util.Scanner;

public class FindFibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int firstTerm = 0;
        int secondTerm = 1;
        int fibonacci;
        int num = scan.nextInt();

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + ", ");
            fibonacci = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = fibonacci;
        }

        System.out.println("Fibonacci Series till " + num + " terms:");
    }
}
