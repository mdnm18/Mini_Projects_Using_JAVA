import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepRunning = true;

        System.out.println("---- Welcome to the Random Number Generator ----");

        while (keepRunning) {
            // Input range for random number generation
            System.out.print("Enter the minimum value: ");
            int min = scanner.nextInt();
            System.out.print("Enter the maximum value: ");
            int max = scanner.nextInt();

            // Validate range
            if (min >= max) {
                System.out.println("Invalid range! Minimum value must be less than maximum value. Try again.");
                continue;
            }

            // Input number of random numbers to generate
            System.out.print("How many random numbers would you like to generate? ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Invalid count! Number of random numbers must be greater than 0. Try again.");
                continue;
            }

            System.out.println("\nGenerating " + count + " random number(s) between " + min + " and " + max + "...\n");

            // Generate and display random numbers
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
            }

            // Menu for user to decide the next action
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Generate more numbers");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                System.out.println("Thank you for using the Random Number Generator! Goodbye!");
                keepRunning = false;
            }
        }

        scanner.close();
    }
}
