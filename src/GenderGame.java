import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        String gender = keyboard.nextLine();
        System.out.print("First name: ");
        String fName = keyboard.nextLine();
        System.out.print("Last name: ");
        String lName = keyboard.nextLine();
        System.out.print("Age: ");
        int age = keyboard.nextInt();
        System.out.println();
        if (gender.equals("F") && age >= 20) {
            System.out.print("Are you married, " + fName + " (y or n)? ");
            String married = keyboard.next();
            System.out.println();
            if (married.equals("y")) {
                System.out.println("Then I shall call you Mrs. " + lName + ".");
            } else {
                System.out.println("Then I shall call you Ms. " + lName + ".");
            }
        }

        if (gender.equals("F") && age < 20) {
            System.out.println("Then I shall call you " + fName + " " + lName + ".");
        }
        if (gender.equals("M") && age >= 20) {
            System.out.println("Then I shall call you Mr. " + lName + ".");
        }
        if (gender.equals("M") && age < 20) {
            System.out.println("Then I shall call you " + fName + " " + lName + ".");
        }

    }
}
