package Exercises;

import java.util.Scanner;

// Shows the Odd numbers
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the second integer number(higher than the other): ");
        int n2 = scanner.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            };
        }
    }
}
