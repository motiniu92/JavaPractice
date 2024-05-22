package com.abmotin.array;

public class FindDuplicateStringValuesOfAnArray {
    public static void main(String[] args) {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "java", "android", "mySql", "gzw", "oiu"};

        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {

                if ((my_array[i].equals(my_array[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + my_array[j]);
                }
            }
        }
    }
}
