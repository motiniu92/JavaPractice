package com.coderbd.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        // Creating Array
        String[] array = {"Java", "Android", "PHP", "Flutter"};
        System.out.println("Printing Array are : " + Arrays.toString(array));

        // Converting Array to List
        List<String> list = new ArrayList<>();
        for(String lang: array){
            list.add(lang);

        }
        System.out.println("Printing List are : " + list);
    }
}
