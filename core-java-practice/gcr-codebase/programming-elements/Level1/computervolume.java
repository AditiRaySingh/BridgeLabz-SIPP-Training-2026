public class computervolume {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double kmToMiles = 0.621371;

        // radius in miles
        double radiusMiles = radiusKm * kmToMiles;

        // volume formula: (4/3) * pi * r^3
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.print(
            "The volume of Earth in km^3 is " + volumeKm +
            " and in miles^3 is " + volumeMiles
        );
    }
}