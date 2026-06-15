import java.util.Scanner;

public class perimeterofsquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        // Calculation
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        sc.close();
    }
}