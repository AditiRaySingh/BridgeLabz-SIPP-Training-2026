class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    public int height(Node root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }
}