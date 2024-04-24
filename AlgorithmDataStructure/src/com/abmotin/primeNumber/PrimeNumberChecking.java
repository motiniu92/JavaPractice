package com.abmotin.primeNumber;

import java.util.Scanner;

public class PrimeNumberChecking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        checkPrimeNumber(num);
    }

    private static void checkPrimeNumber(int num) {
        boolean isPrime = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
