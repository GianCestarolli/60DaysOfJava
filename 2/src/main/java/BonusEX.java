import java.util.Scanner;

public class BonusEX {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a float number; ");
    float FloatNumber = scanner.nextFloat();

    // Transforming it to an Integer
    int IntNumber = (int) FloatNumber;

    System.out.println("This is the same number as an Integer: " + IntNumber);

    scanner.close();
    }
}