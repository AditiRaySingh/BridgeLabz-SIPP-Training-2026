import java.util.HashMap;

public class Solution {

    public int mostFrequentErrorCode(int[] codes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int ans = codes[0];

        for (int code : codes) {

            map.put(code, map.getOrDefault(code, 0) + 1);

            if (map.get(code) > maxFreq) {
                maxFreq = map.get(code);
                ans = code;
            }
        }

        return ans;
    }
}