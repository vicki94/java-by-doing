import java.util.Scanner;
public class BMICalculatorMetric 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double height;
		int weight;

		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();
		
		System.out.print("Your weight in kg: ");
		weight = keyboard.nextInt();

		System.out.println();
		
		System.out.println("Your BMI is " + weight / (height*height));
	}
}