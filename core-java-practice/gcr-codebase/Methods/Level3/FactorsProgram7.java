import java.util.*;

public class FactorsProgram7 {

    public static int[] factors(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            if (n % i == 0) list.add(i);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int greatest(int[] f) {
        return f[f.length - 1];
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int i : f) s += i;
        return s;
    }

    public static long product(int[] f) {
        long p = 1;
        for (int i : f) p *= i;
        return p;
    }

    public static double cubeProduct(int[] f) {
        double p = 1;
        for (int i : f) p *= Math.pow(i, 3);
        return p;
    }

    public static void main(String[] args) {
        int[] f = factors(12);

        System.out.println("Greatest: " + greatest(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Cube Product: " + cubeProduct(f));
    }
}