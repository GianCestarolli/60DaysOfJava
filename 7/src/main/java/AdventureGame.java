import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the adventure game!\n\n" +
                "You are a prisoner and you need to escape from jail.\n" +
                "Make the correct choices to win!\n\n" +
                "The sun is rising. Today is the day that you're planning to escape.\n" +
                "The guard opens your cage, he is escorting you too the laundry.\n" +
                "Now you are in a dark corridor, with no cameras.\n" +
                "Do want to punch him and take his weapon or wait till you reach the laundry?\n" +
                "Type 'Fight' or 'Wait': ");
                String FirstAnswer = scanner.nextLine().toLowerCase();

        if (FirstAnswer.equals("fight")) {
            System.out.println("The guard was alert.\n" +
                    "He takes the gun and shoots you.\n" +
                    "Game Over!");
        }

    }
}
