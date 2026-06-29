class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Car("BMW"),
                new Bus("Volvo"),
                new Bike("Honda"),
                new ElectricCar("Tesla")
        };

        for (Vehicle v : fleet) {
            if (v instanceof Car) {
                Car c = (Car) v;
            }
            System.out.println(v.name + " Cost: " + v.fuelCost(10));
        }
    }
}