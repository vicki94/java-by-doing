import java.util.Random;
import java.util.Scanner;

public class Hi_Lo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int r1 = 1 + r.nextInt(100);
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        int tries = 1;
        int guess = 0;
        while (r1 != guess && tries <= 7) {
            System.out.print("Guess #" +(tries++) + ": ");
            guess = keyboard.nextInt();
            if (r1 == guess) {
                System.out.println("You guessed it! What are the odds?!?");
                break;
            }
            else if (r1 > guess && tries <= 7) {
                System.out.println("Sorry, you are too low.");
            }
            else if (r1 < guess && tries <= 7) {
                System.out.println("Sorry, you are too high.");
            }

        }
        if (tries >= 7 && r1 != guess) {
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
        }

    }
}
