import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count from: ");
        int x = keyboard.nextInt();
        System.out.print("Count to: ");
        int y = keyboard.nextInt();
        System.out.print("Count by: ");
        int z = keyboard.nextInt();
        for (int w = x; w <= y; w = w + z) {
            System.out.print(w + " ");
        }
    }
}
