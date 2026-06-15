import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        // Operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Output
        System.out.println("The addition, subtraction, multiplication and division value of " 
                + number1 + " and " + number2 + " is " 
                + addition + ", " 
                + subtraction + ", " 
                + multiplication + ", and " 
                + division);

        sc.close();
    }
}