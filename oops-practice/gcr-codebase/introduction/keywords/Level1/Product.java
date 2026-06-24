class Product {
    static double discount = 10;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        System.out.println(productName);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(productID);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 2, 201);

        if (p instanceof Product) {
            p.display();
        }
    }
}