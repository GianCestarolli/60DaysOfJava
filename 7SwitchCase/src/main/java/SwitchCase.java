import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the adventure game!\n\n" +
                "You are a prisoner and you need to escape from jail.\n" +
                "Make the correct choices to win!\n\n" +
                "The sun is rising. Today is the day that you're planning to escape.\n" +
                "The guard opens your cage, he is escorting you too the laundry.\n" +
                "Now you are in a dark corridor, with no cameras.\n" +
                "Do you want to punch him and take his weapon or wait until you reach the laundry?\n" +
                "Type 'Fight' or 'Wait': ");
        String answer1 = scanner.nextLine().toLowerCase();

        switch (answer1) {
            case "fight":
                System.out.println("The guard was alert.\n" +
                        "He takes the gun and shoots you.\n" +
                        "Game Over!");
                break;
            case "wait":
                System.out.print("You wait until you reach the laundry." +
                        "After that, the guard leaves you with the others, there's more 40 prisoners washing the clothes.\n" +
                        "There's nobody looking at you.\n" +
                        "Do you want to keep washing the clothes or sneak to the ventilation ducts?\n" +
                        "Type 'Keep' or 'Sneak'");
                String answer2 = scanner.nextLine().toLowerCase();

                switch (answer2) {
                    case "keep":
                        System.out.println("You keep washing the clothes for the rest of the day.\n" +
                                "Game Over!");
                        break;
                    case "sneak":
                        System.out.println("You did it. now you're in the ventilation ducts...\n" +
                                "The games continues...");
                        break;
                    default:
                        System.out.println("That's not a valid answer2.");
                        break;
                }
                break;
            default:
                System.out.println("That's not a valid answer1");
                break;
        }
    }
}
