package com.coderbd.list;

import java.util.ArrayList;
import java.util.List;

public class TestListBook {
    public static void main(String[] args) {
        // Creating list of Books
        List<Book> list = new ArrayList<Book>();

        // Creating Books
        Book bookOne = new Book(101, "Let us C", "Fahim", "BPB", 8);
        Book bookTwo = new Book(102, "Data Structure ", "Nasir", "WDPA", 25);
        Book bookThree = new Book(103, "Algorithm", "Harun", "OJK", 11);

        // Adding Books to list
        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);

        // Traversing list
        for (Book book : list){
            System.out.println(book.getId() +" "+ book.getName() +" "+ book.getAuthor() +" "+ book.getPublisher()
            +" "+ book.getQuantity());
        }
    }
}
