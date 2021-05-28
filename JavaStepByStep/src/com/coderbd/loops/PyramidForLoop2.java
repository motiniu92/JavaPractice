package com.coderbd.loops;

public class PyramidForLoop2 {
    public static void main(String[] args) {
        int term = 8;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
