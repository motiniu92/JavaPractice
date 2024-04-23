package com.abmotin.factorial;

import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int i, factorial = 1;
        int number = sc.nextInt();
        factorial = factorialNumber(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static int factorialNumber(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorialNumber(number - 1);
        }
    }

}
