import java.util.Arrays;

public class BubbleSortSwapCount {

    public static int bubbleSort(int[] nums) {

        int swaps = 0;

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        return swaps;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 1};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(nums));

        int count = bubbleSort(nums);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(nums));

        System.out.println("Total Swaps = " + count);
    }
}