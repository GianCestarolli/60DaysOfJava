import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of levels
        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        // Build the pyramid
        for (int i = 1; i <= levels; i++) {
            // Print the spaces before the *
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

