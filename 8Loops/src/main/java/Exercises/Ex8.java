package Exercises;

import java.util.Scanner;

// Counting the vowels
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: \n");
        String word = scanner.nextLine().toLowerCase();

        for (int i = 0; i < word.length() ; i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.println(letter);
            }
        }
    }
}
