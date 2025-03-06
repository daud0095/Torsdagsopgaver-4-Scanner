import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
    
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        // Check if input is numeric
        if (scanner.hasNextDouble()) {
            // Read user input
            double guess = scanner.nextDouble();

            // Compare it with the random number
            if (guess > rnd_number) {
                // Let the user know the result of the comparison
                System.out.println("Your guess is too high. Try again.");
                // Let the user try again by calling this method recursively
                makeAGuess();
            } else if (guess < rnd_number) {
                // Let the user know the result of the comparison
                System.out.println("Your guess is too low. Try again.");
                // Let the user try again by calling this method recursively
                makeAGuess();
            } else {
                // Let the user know the result of the comparison
                System.out.println("Congratulations! You guessed the number.");
            }
        } else {
            // if input was not numeric show an error message and call this method recursively
            System.out.println("Invalid input. Please enter a numeric value.");
            // Clear the invalid input
            scanner.next();
            // Let the user try again by calling this method recursively
            makeAGuess();
        }
    }
}