package com.coderbd.arrayList.userDefined;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Students students1 = new Students(01,"Abdul Malik", 25);
        Students students2 = new Students(02,"Robin", 31);
        Students students3 = new Students(03,"Hasib", 42);

        ArrayList<Students> studentsArrayList = new ArrayList<Students>();
        studentsArrayList.add(students1);
        studentsArrayList.add(students2);
        studentsArrayList.add(students3);

        Iterator  iterator = studentsArrayList.iterator();
        while (iterator.hasNext()){
            Students stu = (Students) iterator.next();
            System.out.println("Roll : "+stu.getRollNumber()+", "+ "Name : "+stu.getName()+ ", "+"Age : "+stu.getAge());
        }
    }
}
