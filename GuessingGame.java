//Gönenç Barış Bezik & 220444034
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int randomNumber;
    private int attempts;
    
    public GuessingGame() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        attempts = 0;
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game :)");
        System.out.println("Please guess a number between 1 and 100.");

        while (true) {
            
            try {
                System.out.print("Enter your guess (or '0' to quit): ");
                int guess = scanner.nextInt();

                if (guess == 0) {
                    System.out.println("You chose to quit the game. Goodbye...");
                    break;
                }

                if (guess > randomNumber) {
                    System.out.println("Too high...");
                    attempts += 1;
                } 
                else if (guess < randomNumber) {
                    System.out.println("Too low...");
                    attempts += 1;
                } 
                else {
                    attempts += 1;
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Total attempts: " + attempts);
                    break;
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.play();
    }
}
