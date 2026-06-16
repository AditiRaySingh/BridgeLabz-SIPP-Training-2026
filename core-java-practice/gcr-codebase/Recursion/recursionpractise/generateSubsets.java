public class Main {

    static void generateSubsets(int[] arr, int index, String current) {

        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        // Include current element
        generateSubsets(arr, index + 1,
                current + (current.isEmpty() ? "" : ",") + arr[index]);

        // Exclude current element
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        generateSubsets(arr, 0, "");
    }
}