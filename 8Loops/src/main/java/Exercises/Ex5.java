package Exercises;

import java.util.Scanner;

// Factorial calculator
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type an Integer number: ");
        int Number = scanner.nextInt();

        int Multiplier = 1;

        for (int i = 1; i <= Number ; i++) {
             Multiplier *= i;
        }
        System.out.println(Multiplier);
    }
    
}
