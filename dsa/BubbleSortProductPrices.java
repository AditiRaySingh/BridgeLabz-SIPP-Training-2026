import java.util.Arrays;

public class BubbleSortProductPrices {

    public static void bubbleSort(int[] prices) {

        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (prices[j] > prices[j + 1]) {

                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] prices = {450, 120, 780, 300, 250, 600};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(prices));

        bubbleSort(prices);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(prices));
    }
}