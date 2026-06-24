class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.calculateCircumference();
    }
}