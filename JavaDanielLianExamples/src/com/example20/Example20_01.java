package com.example20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Example20_01 {
    public static void main(String[] args) throws IOException {
/*       if (args.length != 1){
            System.out.println("Usage : java E20_01 filename.txt");
           System.exit(1);  */


        String pathName = "F:\\Java_Works\\Github\\JavaPractice\\JavaDanielLianExamples\\src\\com\\example20\\doc.txt";
        File textFile = new File(pathName);


        if (!textFile.exists()) {
            System.out.println("File " + textFile.getName() + "does not exist");
            System.exit(2);
        }

        if (!textFile.isFile()) {
            System.out.println(textFile.getName() + "is a directory");
            System.exit(3);
        }

        try (Scanner input = new Scanner(textFile);
        ){

            PriorityQueue<String> queue = new PriorityQueue<>();
            while (input.hasNext()) {
                queue.offer(input.next());
            }

            while (queue.size() > 0) {
                System.out.println(queue.poll());
            }

        }
    }

}
