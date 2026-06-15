import java.util.Scanner;

public class yarddistance{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Conversion
        double yards = feet / 3;
        double miles = feet / 5280;

        // Output
        System.out.println("Distance in feet: " + feet);
        System.out.println("In yards: " + yards);
        System.out.println("In miles: " + miles);

        sc.close();
    }
}