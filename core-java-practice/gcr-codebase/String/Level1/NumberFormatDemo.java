import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    static void generateException(String text) {
        int number = Integer.parseInt(text); // invalid if not number
        System.out.println("Number is: " + number);
    }

    // Method to handle exception
    static void handleException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number string: ");
        String text = sc.nextLine();

        handleException(text);
    }
}