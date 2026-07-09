import java.util.Arrays;

public class SportsMeetScenario {

    public static void bubbleSort(int[] scores) {

        int swaps = 0;

        boolean alreadySorted = true;

        for (int i = 0; i < scores.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < scores.length - i - 1; j++) {

                if (scores[j] > scores[j + 1]) {

                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    swaps++;

                    swapped = true;

                    alreadySorted = false;
                }
            }

            if (!swapped)
                break;
        }

        System.out.println("Bubble Sorted: " + Arrays.toString(scores));
        System.out.println("Total Swaps: " + swaps);

        if (alreadySorted)
            System.out.println("Already Sorted (Best Case)");
    }

    public static void insertionSort(int[] scores) {

        for (int i = 1; i < scores.length; i++) {

            int key = scores[i];

            int j = i - 1;

            while (j >= 0 && scores[j] > key) {

                scores[j + 1] = scores[j];

                j--;
            }

            scores[j + 1] = key;
        }

        System.out.println("Insertion Sorted: " + Arrays.toString(scores));
    }

    public static void top3(int[] scores) {

        Arrays.sort(scores);

        System.out.println("Gold   : " + scores[scores.length - 1]);
        System.out.println("Silver : " + scores[scores.length - 2]);
        System.out.println("Bronze : " + scores[scores.length - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        System.out.println("Original:");
        System.out.println(Arrays.toString(scores));

        bubbleSort(scores.clone());

        insertionSort(scores.clone());

        top3(scores.clone());
    }
}