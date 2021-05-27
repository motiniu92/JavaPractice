package com.coderbd.inputOutputFromConsole;

import java.util.Scanner;

// // Using Scanner for Getting Input from User
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Developer Name Is " + name);

        System.out.print("Enter Your Age :");
        int age = scanner.nextInt();
        System.out.println("Current Age Is " + age);

        System.out.print("Enter Floating Point :");
        float point = scanner.nextFloat();
        System.out.println("My Point Is " +point);

        scanner.close();
    }
}
