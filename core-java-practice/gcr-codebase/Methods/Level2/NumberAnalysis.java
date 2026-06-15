import java.util.Scanner;

public class NumberAnalysis {

    static boolean isPositive(int n) {
        return n >= 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int a, int b) {

        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Number: ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {

            if (isPositive(num)) {

                if (isEven(num))
                    System.out.println(num +
                            " Positive Even");
                else
                    System.out.println(num +
                            " Positive Odd");
            } else {
                System.out.println(num +
                        " Negative");
            }
        }

        int result =
                compare(numbers[0],
                        numbers[4]);

        if (result == 1)
            System.out.println(
                    "First element is Greater");
        else if (result == 0)
            System.out.println(
                    "Both are Equal");
        else
            System.out.println(
                    "First element is Less");

        sc.close();
    }
}