package com.coderbd.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true    //(5 > 3) and (8 > 5) are true
        System.out.println((5 > 3) && (8 < 5));  // false   //(8 < 5) is false.

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true    //(8 > 5) is true.
        System.out.println((5 > 3) || (8 < 5));  // true    //(5 > 3) is true.
        System.out.println((5 < 3) || (8 < 5));  // false   // (5 < 3) and (8 < 5) are false.

        // ! operator
        System.out.println(!(5 == 3));  // true     //5 == 3 is false.
        System.out.println(!(5 > 3));  // false     5 > 3 is true.
    }
}
