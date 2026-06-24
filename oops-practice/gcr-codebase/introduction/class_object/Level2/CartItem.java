class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    void displayTotal() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 200);
        c.addItem(3);
        c.removeItem(1);
        c.displayTotal();
    }
}