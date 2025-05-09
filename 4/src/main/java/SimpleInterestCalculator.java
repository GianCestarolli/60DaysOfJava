import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: $");
        double P = scanner.nextDouble();

        System.out.print("Enter the annual interest rate(%): ");
        double R = scanner.nextDouble();

        System.out.print("Enter the time period(Years): ");
        double T = scanner.nextDouble();

        double SI = (P * R * T) / 100;

        System.out.println("Simple interest: " + SI);
    }
}
