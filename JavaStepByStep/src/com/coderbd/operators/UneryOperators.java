package com.coderbd.operators;

public class UneryOperators {
    public static void main(String[] args) {
        int result_value = 10;
        System.out.println("Output is : "+result_value);

       result_value = +10;   // indicated positive value 10
        System.out.println("Output is : " +result_value);   //output is 10

        result_value  --;  //decrements the value of 10 by 1
        System.out.println("Output is : " +result_value);  // output is 9

        result_value ++;  // increaments the value of 9  by 1
        System.out.println("Output is : "+ result_value);  // output is 10

        result_value = - result_value;// this minus operator negates an expression
        System.out.println("Output is : "+ result_value); //o/p is -10

        boolean isPass = false;
        System.out.println(isPass); //o/p is false
        System.out.println(!isPass);//o/p is inverted isPass value i.e. true

        // Pre and post Example
        System.out.println();
        System.out.println("Increment Demo :");
        int num = 5;
        System.out.println("output is : "+num);  // output is 5

        // Post Increment
        num++;
        System.out.println("Post Increment : " +num); // output is 6

        // Pre Increment
        ++num;
        System.out.println("Pre Increment : "+ num); // output is 7

        System.out.println();
        System.out.println("Decrement Demo :");
        int value = 5;
        System.out.println("output is : " +value);  // output is 5

        // Post Decrement
        value--;
        System.out.println("Post Decrement : " +value); // output is 6

        // Pre Decrement
        --value;
        System.out.println("Pre Decrement : "+ value); // output is 7

        System.out.println();
        System.out.println("Increment and Adition");
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21

        System.out.println();
        System.out.println("~ and !");
        int x=10;
        int y=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~x);//-11 (minus of total positive value which starts from 0)
        System.out.println(~y);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
