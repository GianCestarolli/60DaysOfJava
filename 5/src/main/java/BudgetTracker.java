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
        double GroceriesP = ((Groceries/TotalExpenses) * 100);
        double TransportationP = ((Transportation/TotalExpenses) * 100);
        double EntmtP = ((Entmt/TotalExpenses) * 100);



    }
}
