package com.chapter20.section06;

import java.util.*;

public class StaticMethod {

    public static void main(String[] args) {

        // sort
        List<String> stringList = Arrays.asList("red", "green", "blue");
        Collections.sort(stringList);
        System.out.println(stringList);

        // reversOrder
        List<String> list = Arrays.asList("yellow", "red", "blue", "green");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // binary search
        List<Integer> list1 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.println("(1) Index: " + Collections.binarySearch(list1, 7));

        System.out.println("(2) Index: " + Collections.binarySearch(list1, 9));
        List<String> list2 = Arrays.asList("blue", "green", "red");
        System.out.println("(3) Index: " +
                Collections.binarySearch(list2, "red"));
        System.out.println("(4) Index: " +
                Collections.binarySearch(list2, "cyan"));

        // shuffles
        List<String> lists = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(lists);
        System.out.println(lists);

        // random
        List<String> lists1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> lists2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list1, new Random(20));
        Collections.shuffle(list2, new Random(20));
        System.out.println(list1);
        System.out.println(list2);

        // copy
        List<String> alist1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> alist2 = Arrays.asList("white", "black");
        Collections.copy(alist1, alist2);
        System.out.println(alist1);

        // fill
        List<String> flist = Arrays.asList("red", "green", "blue");
        Collections.fill(flist, "black");
        System.out.println(flist);

        // max and min
        Collection<String> collection = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(collection));
        System.out.println(Collections.min(collection));

        // disjoint
        Collection<String> collection1 = Arrays.asList("red", "cyan");
        Collection<String> collection2 = Arrays.asList("red", "blue");
        Collection<String> collection3 = Arrays.asList("pink", "tan");
        System.out.println(Collections.disjoint(collection1, collection2));
        System.out.println(Collections.disjoint(collection1, collection3));

        // frequency
        Collection<String> collection4 = Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection4, "red"));

    }


}
