import java.util.Random;

public class BabyBlackJack {
    public static void main (String[] args) {
        Random r = new Random();
        int p1 = 1 + r.nextInt(10);
        int p2 = 1 + r.nextInt(10);
        int pSum = p1 + p2;
        int d1 = 1 + r.nextInt(10);
        int d2 = 1 + r.nextInt(10);
        int dSum = d1 + d2;
        System.out.println("Baby Blackjack!");
        System.out.println();
        System.out.println("You drew " + p1 + " and " + p2 + ".");
        System.out.println("Your total is " + pSum);
        System.out.println();
        System.out.println("The dealer has " + d1 + " and " + d2 + ".");
        System.out.println("Dealers total is " + dSum);
        System.out.println();
        if (pSum > dSum) {
            System.out.println("YOU WIN!");
        }
        else {
            System.out.println("DEALER WINS!");
        }
    }
}
