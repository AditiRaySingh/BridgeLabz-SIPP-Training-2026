import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;

        System.out.println("The Area of triangle in sq in is " + areaInch +
                " and sq cm is " + areaCm);

        sc.close();
    }
}