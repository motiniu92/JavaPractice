package com.excersize21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example21_4 {
    public static void main(String[] args) throws IOException {
        // Scan the file name
        Scanner fileNameScanner = new Scanner(System.in);
        // Create new file and give validations on the files
        System.out.println("Enter your file Name: ");
        String fileName = fileNameScanner.next();
        if (fileName == null || fileName.isEmpty()) {
            System.out.println("File name is not valid");
            System.exit(1);
        }

        File file = new File(fileName);
        // If file does not exist
        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(2);
        }

        // If the provided file is not file
        if (!file.isFile()) {
            System.out.println(file.getName() + " is not a file");
            System.exit(3);
        }

        // Add tje vowels in a charachter array and add the array to set
        Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
        Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowels));

        try (Scanner input = new Scanner(file);) {
            int vCount = 0;
            int cCount = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = Character.toUpperCase(line.charAt(i));
                    if (Character.isLetter(c)) {
                        if (vowelSet.contains(c)) {
                            vCount++;
                        } else {
                            cCount++;
                        }
                    }
                }
            }

            System.out.println("Vowels : " + vCount);
            System.out.println("Consonants : " + cCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
