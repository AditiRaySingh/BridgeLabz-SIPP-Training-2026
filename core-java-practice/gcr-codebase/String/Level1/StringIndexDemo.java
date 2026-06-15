import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate exception
    static void generateException(String str) {
        System.out.println("Character at index 10: " + str.charAt(10)); 
        // if string length < 11 → exception
    }

    // Method to handle exception
    static void handleException(String str) {
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
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