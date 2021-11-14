import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height;
        double weight;
        System.out.print("Your height in inches: ");
        height = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextInt();
        System.out.println();
        weight = weight / 2.205;
        height = height / 39.37;
        double bmi = weight / (height*height);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 15.0){
            System.out.println("BMI Category: morbidly underweight");
        }
        if (bmi >= 15.0 && bmi <= 16.0){
            System.out.println("BMI Category: severely underweight");
        }
        if (bmi >= 16.1 && bmi <= 18.4){
            System.out.println("BMI Category: underweight");
        }
        if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI Category: normal weight");
        }
        if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("BMI Category: overweight");
        }
        if (bmi >= 30.0 && bmi <= 34.9){
            System.out.println("BMI Category: moderately obese");
        }
        if (bmi >= 35.0 && bmi <= 39.9){
            System.out.println("BMI Category: severely obese");
        }
        if (bmi >= 40.0){
            System.out.println("BMI Category: morbidly obese");
        }
    }
}
