import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        String q1 = keyboard.nextLine();
        System.out.println();
        System.out.print("Question 2) Is it a living thing? ");
        String q2 = keyboard.nextLine();
        System.out.println();
        if (q1.equals("inside") && q2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a houseplant?!?");
        }
        if (q1.equals("inside") && q2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a shower curtain?!?");
        }
        if (q1.equals("outside") && q2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a bison?!?");
        }
        if (q1.equals("outside") && q2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a billboard?!?");
        }
        if (q1.equals("both") && q2.equals("alive")) {
            System.out.println("Then what else could you be thinking of besides a dog?!?");
        }
        if (q1.equals("both") && q2.equals("not alive")) {
            System.out.println("Then what else could you be thinking of besides a cell phone?!?");
        }
    }
}
