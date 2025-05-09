import java.util.Scanner;

public class Practicing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the name of your favorite book: ");
        String BookName = scanner.nextLine();

        System.out.println("Type the author of it: ");
        String BookAuthor = scanner.nextLine();

        System.out.println("What's your rating for this book?: ");
        double BookRating = scanner.nextDouble();

        String BookDetails = String.format("Book name: %s \nAuthor name: %s \nRating: %s", BookName, BookAuthor, BookRating);
        System.out.println(BookDetails);
    }
}
