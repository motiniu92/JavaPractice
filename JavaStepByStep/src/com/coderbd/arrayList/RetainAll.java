package com.coderbd.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Rasel");
        arrayList.add("Gafur");
        arrayList.add("Ajad");
        arrayList.add("Anamul");
        arrayList.add("Nasir");
        System.out.println("An initial list of elements: "+arrayList);

        ArrayList<String> list=new ArrayList<String>();
        list.add("Rasel");
        list.add("Hanumat");
        arrayList.retainAll(list);
        System.out.println("iterating the elements after retaining the elements of list");
        Iterator itr=arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
