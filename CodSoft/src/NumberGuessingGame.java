import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;
        String playAgain;
        do {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    score++;
                    System.out.println("Congratulations! You guessed the number correctly.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (!hasGuessedCorrectly && attempts == maxAttempts) {
                    System.out.println("You've used all attempts. The correct number was: " + numberToGuess);
                }
            }

            rounds++;
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game Over. You played " + rounds + " rounds and your score is " + score + ".");
        scanner.close();
    }
}


