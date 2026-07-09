class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }
}

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Aditi", 101);
        p1.display();

        Pair<Double, String> p2 = new Pair<>(95.5, "Java");
        p2.display();
    }
}