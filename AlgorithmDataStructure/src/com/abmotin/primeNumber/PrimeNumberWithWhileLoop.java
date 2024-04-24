package com.abmotin.primeNumber;

import java.util.Scanner;

public class PrimeNumberWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = scan.nextInt();
        int i = 2;
        boolean isPrime = false;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
            ++i;
        }

        if (!isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
