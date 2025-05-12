import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your monthly income: ");
        int Income = scanner.nextInt();
        scanner.nextLine();// Consumes the pending line.

        System.out.print("Enter the value of your rent: ");
        int Rent = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your monthly groceries expense: ");
        int Groceries = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your monthly transportation expense: ");
        int Transportation = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your monthly entertainment expense: ");
        int Entmt = scanner.nextInt();
        scanner.nextLine();



    }
}
