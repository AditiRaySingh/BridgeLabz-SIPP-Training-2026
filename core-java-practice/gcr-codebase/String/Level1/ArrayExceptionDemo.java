import java.util.Scanner;

public class ArrayExceptionDemo {

    // Method to generate exception
    static void generateException(String[] names) {
        System.out.println(names[names.length]); // Invalid index
    }

    // Method to handle exception
    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]); // Invalid index
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Generic Exception caught!");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Generate exception
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception generated and handled in main:");
            System.out.println(e);
        }

        // Handle exception
        handleException(names);

        sc.close();
    }
}