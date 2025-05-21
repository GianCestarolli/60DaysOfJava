package Exercises;
import java.util.Scanner;

// Multiplication table
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int Number = scanner.nextInt();

        System.out.println(Number + " multiplication table: \n");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Number * i);
        }
    }
}

