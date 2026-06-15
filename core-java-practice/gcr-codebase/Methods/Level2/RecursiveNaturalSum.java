import java.util.Scanner;

public class RecursiveNaturalSum {

    static int recursiveSum(int n) {

        if (n == 1)
            return 1;

        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Natural Number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int recursive = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive Sum = " + recursive);
        System.out.println("Formula Sum   = " + formula);
        System.out.println("Equal? " + (recursive == formula));

        sc.close();
    }
}