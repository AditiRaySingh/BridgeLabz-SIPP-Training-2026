class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Solution {

    public void deleteFolderTree(Node root) {

        if (root == null)
            return;

        deleteFolderTree(root.left);

        deleteFolderTree(root.right);

        System.out.println("Delete : " + root.val);
    }
}