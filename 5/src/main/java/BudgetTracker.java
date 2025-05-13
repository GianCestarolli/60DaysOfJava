import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for all the information
        System.out.print("Enter your monthly income: ");
        double Income = scanner.nextDouble();

        System.out.print("Enter the value of your rent: ");
        double Rent = scanner.nextDouble();

        System.out.print("Enter your monthly groceries expense: ");
        double Groceries = scanner.nextDouble();

        System.out.print("Enter your monthly transportation expense: ");
        double Transportation = scanner.nextDouble();

        System.out.print("Enter your monthly entertainment expense: ");
        double Entmt = scanner.nextDouble();

        //Calculating
        double TotalExpenses = (Rent + Groceries + Transportation + Entmt);
        double RemainingBudget = (Income - TotalExpenses);

        double RentP = ((Rent/TotalExpenses) * 100);
        double RoundedRentP = Math.round(RentP*100) / 100.0;

        double GroceriesP = ((Groceries/TotalExpenses) * 100);
        double RoundedGroceriesP = Math.round(GroceriesP*100) / 100.0;

        double TransportationP = ((Transportation/TotalExpenses) * 100);
        double RoundedTransportationP = Math.round(TransportationP*100) / 100.0;

        double EntmtP = ((Entmt/TotalExpenses) * 100);
        double RoundedEntmtP = Math.round(EntmtP*100) / 100.0;

        //Summary
        System.out.println("\nYour Monthly Income: " + Income);
        System.out.println("Your Total expenses: " + TotalExpenses);
        System.out.println("Your remaining budget: " + RemainingBudget);

        System.out.println("\nPercentage of money spent on:\n");
        System.out.println("Rent: " + RoundedRentP + "%");
        System.out.println("Groceries: " + RoundedGroceriesP + "%");
        System.out.println("Transportation: " + RoundedTransportationP + "%");
        System.out.println("Entertainment: " + RoundedEntmtP + "%");
    }
}
