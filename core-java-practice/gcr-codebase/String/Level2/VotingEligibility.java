import java.util.Random;

public class VotingEligibility {

    static int[] generateAges(int n) {

        Random r = new Random();

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(90) + 10;
        }

        return ages;
    }

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }

        return result;
    }

    static void display(String[][] data) {

        System.out.printf("%-10s %-10s\n",
                "Age", "Can Vote");

        for (String[] row : data) {
            System.out.printf("%-10s %-10s\n",
                    row[0], row[1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);

        String[][] result = checkVoting(ages);

        display(result);
    }
}