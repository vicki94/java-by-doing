import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        if (num < 0) {
            System.out.println("You can't take the square root of negative number, silly.");
            System.out.print("Try again: ");
            num = keyboard.nextInt();
            while (num < 0);
        }
            System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");

    }
}
