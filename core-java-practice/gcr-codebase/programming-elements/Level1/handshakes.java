import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculation using formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("Maximum number of handshakes among " 
                + numberOfStudents + " students is " + handshakes);

        sc.close();
    }
}