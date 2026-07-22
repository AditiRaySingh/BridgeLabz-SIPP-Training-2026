import java.util.*;

public class VendingMachineChange {

    public static List<List<Integer>> makeChange(int[] coins, int target) {
        Arrays.sort(coins);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] coins, int target, int start,
                                  int sum, List<Integer> path,
                                  List<List<Integer>> result) {

        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            // Pruning
            if (sum + coins[i] > target)
                break;

            // Choose
            path.add(coins[i]);

            // Reuse same coin (i, not i + 1)
            backtrack(coins, target, i, sum + coins[i], path, result);

            // Backtrack
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        int target = 8;

        List<List<Integer>> combinations = makeChange(coins, target);

        System.out.println("Possible combinations:");
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }
    }
}