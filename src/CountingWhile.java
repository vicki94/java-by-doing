import java.util.Scanner;

public class CountingWhile {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        int n = 9;
        while ( n < 100)
        {
            System.out.println( (n+1) + ". " + message );
            n+=10;
        }
        //What does n++ do? Remove it and see what happens. (Then put it back.)
        //See if you can change the code so that the message still prints ten times, but the numbers in front count by tens
    }
}
