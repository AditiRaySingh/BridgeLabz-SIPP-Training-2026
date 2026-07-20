class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean isValidBST(Node root) {

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(Node root, long min, long max) {

        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        return check(root.left, min, root.val)
                && check(root.right, root.val, max);
    }
}