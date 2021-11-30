import java.util.Scanner;

public class AddingValuesWithForLoop {
    public static void main (String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        int num = kb.nextInt();
        int sum = 0;
        System.out.println();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
            sum = (i*(i+1))/2;
        }System.out.println();
        System.out.println("The sum is "+sum+".");
    }
}
