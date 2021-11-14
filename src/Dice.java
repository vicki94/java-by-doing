import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Here comes the dice!");
        int r1 = r.nextInt(6);
        System.out.println("Roll #1: " + r1);
        int r2 = r.nextInt(6);
        System.out.println("Roll #2: " + r2);
        System.out.println("The total is " + (r1+r2) + "!");

    }

}
