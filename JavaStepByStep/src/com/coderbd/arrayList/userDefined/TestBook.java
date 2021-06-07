package com.coderbd.arrayList.userDefined;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list = new ArrayList<Book>();

        //Creating Books
        Book b1 = new Book(101, "Java and Android", "Arif Khan", "BPWL", 8);
        Book b2 = new Book(102, "Data Communications and Networking", "Mahfuj", "BD", 4);
        Book b3 = new Book(103, "Operating System", "Fayjullah", "NPR", 6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for (Book book : list) {
            System.out.println(book.getId() + ", " + book.getName() + ", " + book.getAuthor() + ", " + book.getPublisher() + ", " + book.getQuantity());
        }
    }
}
