import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithCounter {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int Low = 1;
    int High = 10;
    int actual = r.nextInt(High-Low) + Low;
        //int actual = 1+r.nextInt(10);
        //System.out.println(actual);

    System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
    int tries=1;
    System.out.print("Your guess: ");
    int guess = keyboard.nextInt();
    while(guess!=actual){
            if(guess!=actual){
                System.out.println("That is incorrect. Guess again.");
                System.out.print("Your guess: ");
                guess = keyboard.nextInt();
                tries++;
            }
        }
    System.out.println("That's right!  You're a good guesser.");
    System.out.println("It took you "+tries+" tries.");
    }
}



