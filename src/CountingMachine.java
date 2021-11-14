import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int x = keyboard.nextInt();
        for (int y = 0; y <= x; y++) {
            System.out.print(y + " ");
        }
    }
}
