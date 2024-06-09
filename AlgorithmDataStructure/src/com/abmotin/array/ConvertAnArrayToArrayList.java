package com.abmotin.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertAnArrayToArrayList {
    public static void main(String[] args) {
        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        ArrayList list = new ArrayList(Arrays.asList(my_array));

        System.out.println(list);
    }
}
