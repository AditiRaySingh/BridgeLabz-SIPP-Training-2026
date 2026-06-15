import java.util.Random;

public class FootballTeamHeight {

    // Generate random heights between 150 and 250
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }
        return heights;
    }

    // Sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // Mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // Tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Display array
    public static void display(int[] arr) {
        System.out.print("Player Heights: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        display(heights);

        int sum = findSum(heights);
        double mean = findMean(heights);
        int min = findShortest(heights);
        int max = findTallest(heights);

        System.out.println("\n--- Team Statistics ---");
        System.out.println("Total Sum: " + sum);
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Player: " + min + " cm");
        System.out.println("Tallest Player: " + max + " cm");
    }
}