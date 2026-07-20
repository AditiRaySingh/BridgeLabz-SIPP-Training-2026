class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public Node lowestCommonAncestor(Node root, int p, int q) {

        while (root != null) {

            if (p < root.val && q < root.val) {

                root = root.left;

            } else if (p > root.val && q > root.val) {

                root = root.right;

            } else {

                return root;
            }
        }

        return null;
    }
}