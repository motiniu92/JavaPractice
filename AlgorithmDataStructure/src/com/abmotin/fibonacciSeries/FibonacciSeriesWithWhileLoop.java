package com.abmotin.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeriesWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int firstTerm = 0;
        int secondTerm = 1;
        int i = 1;
        int fibonacci;
        int num = scan.nextInt();

        while (i <= num) {
            System.out.print(firstTerm + ", ");

            fibonacci = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = fibonacci;

            i++;
        }

        System.out.println("Fibonacci Series till " + num + " terms:");
    }
}
