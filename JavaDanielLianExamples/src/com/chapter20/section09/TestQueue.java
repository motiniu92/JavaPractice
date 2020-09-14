package com.chapter20.section09;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");


        while (queue.size() > 0){
            System.out.println(queue.remove() + " " );
        }
    }










}
