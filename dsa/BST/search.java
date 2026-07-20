class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean search(Node root, int target) {

        while (root != null) {

            if (root.val == target)
                return true;

            if (target < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }
}