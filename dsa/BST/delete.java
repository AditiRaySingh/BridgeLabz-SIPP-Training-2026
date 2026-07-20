class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {

            root.left = delete(root.left, key);

        } else if (key > root.val) {

            root.right = delete(root.right, key);

        } else {

            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
    }
}