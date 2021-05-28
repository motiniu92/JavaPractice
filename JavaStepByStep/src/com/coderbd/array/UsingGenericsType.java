package com.coderbd.array;

import java.util.ArrayList;

public class UsingGenericsType {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);
    }
}
