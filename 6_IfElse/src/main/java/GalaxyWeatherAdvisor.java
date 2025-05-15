import java.util.Scanner;

public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Galaxy Weather Advisor!");

        System.out.print("Tell me the planet you are on (Earth, Mars, Venus or Jupiter): ");
        String planet = scanner.nextLine().toLowerCase();

        if (planet.equals("mars") || planet.equals("earth") || planet.equals("venus") || planet.equals("jupiter")) {
            System.out.print("What's the current temperature on " + planet + ", in Celsius: ");
            int temperature = scanner.nextInt();
            scanner.nextLine();

            if (temperature < 20) {
                System.out.println("Wow, it's very cold ! You should wear a jacket and pants.");
            } else if (temperature > 100) {
                System.out.println("OMG! It's like an oven!!!! You're gonna die!!!");
            } else {
                System.out.println("It's hot, but not that hot... You can wear shorts and a shirt");
            }
        }
        else {
            System.out.println("Sorry, " + planet + " is not a valid planet.");
        }
    }
}
