import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> void display(List<T> list) {

        List<T> result = list.stream()
                             .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void main(String[] args) {

        display(Arrays.asList(1, 2, 3, 4));

        display(Arrays.asList("Java", "Python", "C++"));
    }
}