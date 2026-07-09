import java.util.*;

class Utility {

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30);

        List<String> names = Arrays.asList("Java", "Python", "C++");

        Utility.printList(nums);

        Utility.printList(names);
    }
}