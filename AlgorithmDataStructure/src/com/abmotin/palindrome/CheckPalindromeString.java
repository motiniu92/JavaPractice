package com.abmotin.palindrome;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String inputString = scan.nextLine();
        String palindromeString = "";
        int strLength = inputString.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            palindromeString = palindromeString + inputString.charAt(i);
        }

        if (inputString.equalsIgnoreCase(palindromeString)) {
            System.out.println(inputString + " is a Palindrome String.");
        } else {
            System.out.println(inputString + " is not a Palindrome String.");
        }

    }
}
