public class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        System.out.println("10 KM = " +
                convertKmToMiles(10) + " Miles");

        System.out.println("10 Miles = " +
                convertMilesToKm(10) + " KM");

        System.out.println("10 Meters = " +
                convertMetersToFeet(10) + " Feet");

        System.out.println("10 Feet = " +
                convertFeetToMeters(10) + " Meters");
    }
}