package com.abmotin.factorial;

import java.util.Scanner;

public class FactorialNumberWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int i = 1;
        int num = scan.nextInt();
        long factorial = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

}
