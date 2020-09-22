package com.excersize20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Example20_11 {
    public static void main(String[] args) {
        String fileName = "F:\\Java_Works\\Github\\JavaPractice\\JavaDanielLianExamples\\src\\com\\excersize20\\checkSymbols.txt";
        File file = new File(fileName);

        //check file name exists
        if (!file.exists()) {
            System.out.println("File : " + file.getName() + "does not exists");

        }

        // check the file is not directory
        if (!file.isFile()) {
            System.out.println(file.getName() + "is not a file");

        }

        // Grouping symbol chek

    }

    public static boolean grouingSymbolsCorrect(File file) {
        try (Scanner input = new Scanner(file)) {
            Stack<Character> stack = new Stack<>();
            while (input.hasNext()) {
                String s = input.next().replaceAll("\',*\'", "");
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    System.out.println(stack);
                    if (c == '(' || c == '{' || c == ']') {
                        stack.push(c);
                    } else if (c == ')' || c == '}' || c == ']') {
                        if (stack.empty()) {
                            return false;
                        }

                        if (!(stack.pop() == getOpeningSymbol(c))) {
                            return false;
                        }
                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    private static char getOpeningSymbol(char c) {
        char[] opening = {'(', '{', '['};
        char[] closing = {')', '}', ']'};
        for (int i = 0; i < closing.length; i++) {
            if (c == closing[i]) {
                return opening[i];
            }
        }
        return 'z';
    }

}
