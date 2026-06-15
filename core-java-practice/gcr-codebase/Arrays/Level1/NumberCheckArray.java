import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive Even");
                } else {
                    System.out.println(numbers[i] + " is Positive Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("Last element is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}