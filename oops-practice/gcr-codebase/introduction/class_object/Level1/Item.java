class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void calculateTotal(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Item i = new Item(1, "Pen", 20);
        i.displayItem();
        i.calculateTotal(5);
    }
}