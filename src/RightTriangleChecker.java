import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        int s1 = keyboard.nextInt();
        System.out.print("Side 2: ");
        int s2 = keyboard.nextInt();
        while (s1 > s2) {
            System.out.println(s2 + " is smaller than " + s1 + ". Try again.");
            System.out.print("Side 2: ");
            s2 = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        int s3 = keyboard.nextInt();
        while (s2 > s3) {
            System.out.println(s3 + " is smaller than " + s2 + ". Try again.");
            System.out.print("Side 3: ");
            s3 = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Your three sides are " + s1 + " " + s2 + " " + s3);
        int total = (s1 * s1) + (s2 * s2);
        double side3 = Math.sqrt(total);
        if (side3 == s3) {
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        } else {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
