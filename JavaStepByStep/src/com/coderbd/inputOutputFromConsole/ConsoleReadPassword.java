package com.coderbd.inputOutputFromConsole;

import java.io.Console;

//Console readPassword() method example
public class ConsoleReadPassword {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null){
            System.out.println("Console is not available current JVM process:");
            return;
        }

        char[] password = console.readPassword("Enter the password: ");
        System.out.println("Entered password:" + new String(password));
    }
}
