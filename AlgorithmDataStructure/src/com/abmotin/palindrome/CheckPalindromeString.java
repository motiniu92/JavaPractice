package com.abmotin.palindrome;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String inputString = scan.nextLine();
        StringBuilder palindromeString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            palindromeString.append(inputString.charAt(i));
        }

        if (inputString.equalsIgnoreCase(palindromeString.toString())) {
            System.out.println(inputString + " is a Palindrome String.");
        } else {
            System.out.println(inputString + " is not a Palindrome String.");
        }

    }
}
