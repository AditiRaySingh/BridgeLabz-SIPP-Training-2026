public class UnitConverter3 {

    public static double fahrenheitToCelsius(
            double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(
            double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println("100F = "
                + fahrenheitToCelsius(100));

        System.out.println("37C = "
                + celsiusToFahrenheit(37));

        System.out.println("50 Pounds = "
                + poundsToKg(50));

        System.out.println("25 Kg = "
                + kgToPounds(25));

        System.out.println("10 Gallons = "
                + gallonsToLiters(10));

        System.out.println("20 Liters = "
                + litersToGallons(20));
    }
}