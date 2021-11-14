import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What's your last name? ");
        String lName = keyboard.nextLine();
        if (lName.compareTo("Carswell") <= 0) {
            System.out.print("You don't have to wait long, " + "\"" + lName + "\".");
        } else if (lName.compareTo("Jones") <= 0) {
            System.out.print("That's not too bad, " + lName);
        } else if (lName.compareTo("Smith") <= 0) {
            System.out.print("Looks like a bit of a wait, " + lName +".");
        } else if (lName.compareTo("Young") <= 0) {
            System.out.print("It's going to be a while, " + lName +".");
        } else if (lName.compareTo("Young") >= 0) {
            System.out.print("Not going anywhere for a while, " + lName +"?");
        }
    }
}
