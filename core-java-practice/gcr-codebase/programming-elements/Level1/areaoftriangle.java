import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base of triangle (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (cm): ");
        double height = sc.nextDouble();

        // Area in cm^2
        double areaCm = 0.5 * base * height;

        // Convert cm^2 to inches^2
        double areaInch = areaCm / 6.4516;

        // Output
        System.out.println("Area of Triangle:");
        System.out.println("In square centimeters = " + areaCm);
        System.out.println("In square inches = " + areaInch);

        sc.close();
    }
}