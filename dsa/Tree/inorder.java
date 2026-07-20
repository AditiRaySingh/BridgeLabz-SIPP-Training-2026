import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    public void inorder(Node root, List<Integer> ans) {

        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    public List<Integer> getSortedLeaderboard(Node root) {

        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);

        return ans;
    }
}