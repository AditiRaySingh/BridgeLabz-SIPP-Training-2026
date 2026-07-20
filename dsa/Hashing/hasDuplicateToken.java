import java.util.HashSet;

public class Solution {

    public boolean hasDuplicateToken(String[] tokens) {

        HashSet<String> set = new HashSet<>();

        for (String token : tokens) {

            if (set.contains(token)) {
                return true;
            }

            set.add(token);
        }

        return false;
    }
}