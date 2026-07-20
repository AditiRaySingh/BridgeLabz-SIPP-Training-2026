class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    int diameter = 0;

    public int longestCommunicationPath(Node root) {

        height(root);

        return diameter;
    }

    public int height(Node root) {

        if (root == null)
            return -1;

        int left = height(root.left);

        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }
}