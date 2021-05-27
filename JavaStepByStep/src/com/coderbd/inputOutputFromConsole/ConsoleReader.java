package com.coderbd.inputOutputFromConsole;

import java.io.Console;
import java.io.Reader;
import java.util.Scanner;

// Console reader() method example
public class ConsoleReader {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.out.println("Console is not available to current JVM process");
            return;
        }

        Reader consoleReader = console.reader();
        Scanner scanner = new Scanner(consoleReader);

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Entered age: " + age);

        scanner.close();

    }
}
