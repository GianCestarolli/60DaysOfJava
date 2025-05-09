import java.util.Scanner;

public class Practicing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        double x = scanner.nextDouble();

        System.out.println("Type the second number: ");
        double y = scanner.nextDouble();

        System.out.println("Type the third number: ");
        double z = scanner.nextDouble();

        double mean = (x + y + z) / 3;

        System.out.println("The mean of these number is: " + mean);

    }
}
