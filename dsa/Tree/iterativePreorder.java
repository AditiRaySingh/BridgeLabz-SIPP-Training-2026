import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    public List<Integer> iterativePreorder(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            Node current = stack.pop();

            ans.add(current.val);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }

        return ans;
    }
}