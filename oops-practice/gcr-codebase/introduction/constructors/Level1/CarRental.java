class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculateCost() {
        int costPerDay = 1000;
        int total = rentalDays * costPerDay;

        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Aditi", "Swift", 5);

        c1.calculateCost();
        c2.calculateCost();
    }
}