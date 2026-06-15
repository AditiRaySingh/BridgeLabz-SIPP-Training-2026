import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception
    static void generateException(String str) {
        int start = 5;
        int end = 2; // invalid because start > end

        System.out.println(str.substring(start, end));
    }

    // Method to handle exception
    static void handleException(String str) {
        try {
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        handleException(str);
    }
}