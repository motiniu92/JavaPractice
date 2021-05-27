package com.coderbd.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Initial values
        int x = 5;
        int y = 6;
        int z = 2;

        //binary value of x=5 is 0101
        // binary value of y=6 is 0110
        // binary value of z = 2 0010

        // bitwise and  0101& 0110=0100 = 4
        System.out.println("x&y = " + (x & y));

        // bitwise or 0101 | 0110 = 0111 = 7
        System.out.println("x|y = " + (x | y));

        // bitwise xor  0101 ^ 0110 = 0011 = 3
        System.out.println("x^y = " + (x ^ y));

        // bitwise complement of 5 i.e.~0101=1010 returns  2's complement of 1010 = -6
        System.out.println("~x = " + ~x);

        // left shift operator 0010 returns 1000 i.e.8
        System.out.println("z<<2 = " + (z << 2));

        // right shift operator 0110 returns 0001 i.e.1
        System.out.println("x>>2 = " + (x>> 2));

        // unsigned right shift operator for y=6 i.e.0110 returns 0001 i.e.1
        System.out.println("y>>>2 = " + (y >>> 2));
    }
}
