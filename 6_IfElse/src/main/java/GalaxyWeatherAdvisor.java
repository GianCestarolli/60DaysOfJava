import java.util.Locale;
import java.util.Scanner;

public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Galaxy Weather Advisor!");

        System.out.print("Tell me the planet you are on (Earth, Mars, Venus or Jupiter): ");
        String planet = scanner.nextLine().toLowerCase();

        if (planet.equals("mars") || planet.equals("earth") || planet.equals("venus") || planet.equals("jupiter")) {
            System.out.print("What's the current temperature on" + planet + ",in Celsius: ");
            int temperature = scanner.nextInt();
            scanner.nextLine();

            if (temperature < 20) {
                System.out.println("Wow, it's very cold ! You should wear a jacket and pants.");
            }
        }
    }
}
