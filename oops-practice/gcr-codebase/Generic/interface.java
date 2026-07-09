interface Printer<T> {

    void print(T data);
}

class StringPrinter implements Printer<String> {

    public void print(String data) {
        System.out.println(data);
    }
}

class IntegerPrinter implements Printer<Integer> {

    public void print(Integer data) {
        System.out.println(data);
    }
}

public class Main {

    public static void main(String[] args) {

        Printer<String> p1 = new StringPrinter();
        p1.print("Hello Java");

        Printer<Integer> p2 = new IntegerPrinter();
        p2.print(100);
    }
}