import java.util.Scanner;

public class BadNumberGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = 10;
        System.out.println("The worst number guessing game ever!!");
        System.out.println();
        System.out.print("I'm thinking of a number from 1 - 10. Try to guess it! ");
        int y = keyboard.nextInt();
        System.out.println();
        if (y != x) {
            System.out.print("Your wrong!! It was " + x + "!");
        }
        if ( y == x) {
            System.out.print("Wow you're good, I can't believe you guessed it was " + x + "!");
        }
    }
}
