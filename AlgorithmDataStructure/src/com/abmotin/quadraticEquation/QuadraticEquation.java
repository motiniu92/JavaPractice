package com.abmotin.quadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a b c : ");

        int a, b, c;
        double root1, root2;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);

        } else if (determinant == 0) {
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root2 = (double) -b / (2 * a);
            root1 = root2;
            System.out.format("root1 = root2 = %.2f;", root1);

        } else {
            // roots are complex number and distinct
            double real = (double) -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
