class Calculator {

    public static <T extends Number> double sum(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println(Calculator.sum(10, 20));

        System.out.println(Calculator.sum(5.5, 2.5));
    }
}