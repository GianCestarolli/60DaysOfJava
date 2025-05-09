import java.util.Scanner;

public class CalorieCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Food1, Food2, Food3;
        int F1C, F2C, F3C;

        // Requesting the name and the calories of the first food
        System.out.print("Type the first food: ");
        Food1 = scanner.nextLine();
        System.out.print("Type the calories of the " + Food1 + ": ");
        F1C = scanner.nextInt();
        scanner.nextLine();// Consumes the pending line

        // Requesting the name and the calories of the second food
        System.out.print("Type the second food: ");
        Food2 = scanner.nextLine();
        System.out.print("Type the calories of the " + Food2 + ": ");
        F2C = scanner.nextInt();
        scanner.nextLine();// Consumes the pending line

        // Requesting the name and the calories of the third food
        System.out.print("Type the third food: ");
        Food3 = scanner.nextLine();
        System.out.print("Type the calories of the " + Food3 + ": ");
        F3C = scanner.nextInt();
        scanner.nextLine();// Consumes the pending line

        int TotalCalories = F1C + F2C + F3C;

        System.out.println("\nThe total calories of these 3 foods: " + TotalCalories);

        System.out.println("\nSummary: ");
        System.out.println(String.format("%s: %s", Food1, F1C));
        System.out.println(String.format("%s: %s", Food2, F2C));
        System.out.println(String.format("%s: %s", Food3, F3C));
    }
}
