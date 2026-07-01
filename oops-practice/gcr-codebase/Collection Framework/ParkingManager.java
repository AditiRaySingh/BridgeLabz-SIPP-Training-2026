import java.util.*;

public class ParkingManager {
    static ArrayList<String> vehicles = new ArrayList<>();

    public static void addVehicle(String number) {
        vehicles.add(number);
        System.out.println("Vehicle entered: " + number);
    }

    public static void removeVehicle(String number) {
        if (vehicles.remove(number)) {
            System.out.println("Vehicle exited: " + number);
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public static void searchVehicle(String number) {
        if (vehicles.contains(number)) {
            System.out.println("Vehicle is parked.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public static void displayVehicles() {
        System.out.println("Parked Vehicles:");
        for (String v : vehicles) {
            System.out.println(v);
        }
        System.out.println("Total Slots Occupied: " + vehicles.size());
    }

    public static void main(String[] args) {
        addVehicle("UP32AB1234");
        addVehicle("UP32XY5678");

        searchVehicle("UP32AB1234");
        removeVehicle("UP32XY5678");
        displayVehicles();
    }
}