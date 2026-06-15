import java.util.Scanner;

public class heightincm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heightCm;

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        // convert cm to inches
        double totalInches = heightCm / 2.54;

        // convert inches to feet
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.print(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }
}