import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type something: ");
        String UserInput = scanner.nextLine();

        if (UserInput.equalsIgnoreCase("Hello")) {
            System.out.println("\nHi, How can I help you today?");
        }
        else if (UserInput.equalsIgnoreCase("how are you?")) {
            System.out.println("I'm very good, tks!");
        }
        else if (UserInput.equalsIgnoreCase("Tell me about the weather today")) {
            System.out.println("I can't see the weather, But it's always sunny in my world!");
        }
        else if (UserInput.equalsIgnoreCase("bye")) {
            System.out.println("Bye Bye!\nSee you soon!");
        }
        else {
            System.out.println("Sorry, I can't understand...");
        }
    }
}
