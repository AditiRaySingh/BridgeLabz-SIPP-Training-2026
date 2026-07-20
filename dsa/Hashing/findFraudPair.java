import java.util.HashMap;

public class Solution {

    public int[] findFraudPair(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int need = target - amounts[i];

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.put(amounts[i], i);
        }

        return new int[] { -1, -1 };
    }
}