import java.util.Arrays;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {90, 75, 88, 60, 95};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(scores));
    }
}