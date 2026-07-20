import java.util.Stack;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();

        while (true) {

            while (root != null) {

                stack.push(root);

                root = root.left;
            }

            root = stack.pop();

            k--;

            if (k == 0)
                return root.val;

            root = root.right;
        }
    }
}