package com.coderbd.inputOutputFromConsole;

import java.io.Console;
import java.util.Scanner;

//Console readLine() method example
public class ConsoleReadLine {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.out.println("Console is not available to current JVM process");
            return;
        }

        String userName = console.readLine("Enter the username: ");
        System.out.println("Entered username: " + userName);
    }
}
