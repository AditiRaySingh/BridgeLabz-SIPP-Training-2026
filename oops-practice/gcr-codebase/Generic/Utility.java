class Utility {

    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T value : arr) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {10, 50, 25, 100};

        String[] names = {"Aditi", "Rahul", "Zoya"};

        System.out.println(Utility.findMax(numbers));

        System.out.println(Utility.findMax(names));
    }
}