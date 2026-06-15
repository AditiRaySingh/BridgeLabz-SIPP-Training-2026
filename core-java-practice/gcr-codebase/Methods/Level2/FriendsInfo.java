import java.util.Scanner;

public class FriendsInfo {

    static String findYoungest(
            String[] names,
            int[] ages) {

        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {

            if (ages[i] < ages[minIndex])
                minIndex = i;
        }

        return names[minIndex];
    }

    static String findTallest(
            String[] names,
            double[] heights) {

        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {

            if (heights[i] > heights[maxIndex])
                maxIndex = i;
        }

        return names[maxIndex];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names =
                {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Age of "
                    + names[i] + ": ");

            ages[i] = sc.nextInt();

            System.out.print("Height of "
                    + names[i] + ": ");

            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest : "
                + findYoungest(names, ages));

        System.out.println("Tallest : "
                + findTallest(names, heights));

        sc.close();
    }
}