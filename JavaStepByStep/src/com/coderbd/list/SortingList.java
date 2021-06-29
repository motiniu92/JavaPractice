package com.coderbd.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

        public static void main(String[] args) {
            // Creating a list of fruits
            List<String> listFirst = new ArrayList<String>();

            listFirst.add("Mango");
            listFirst.add("Grapes");
            listFirst.add("Banana");
            listFirst.add("Apple");
            listFirst.add("Water Melon");

            // Sorting the list
            Collections.sort(listFirst);
            for (String fruit: listFirst){
                System.out.println(fruit);
            }


            System.out.println("Sorting Numbers....");
            // Creating a list of numbers
            List<Integer> listSecond = new ArrayList<Integer>();
            listSecond.add(21);
            listSecond.add(2);
            listSecond.add(11);
            listSecond.add(1);

            // Sorting the list
            Collections.sort(listSecond);
            for (Integer number : listSecond){
                System.out.println(number);
            }
        }
    }
