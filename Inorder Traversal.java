class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int d) {
        data = d;
    }
}

public class BinaryTree {
    TreeNode root;

    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();

        t.root = new TreeNode(1);
        t.root.left = new TreeNode(2);
        t.root.right = new TreeNode(3);
        t.root.left.left = new TreeNode(4);

        t.inorder(t.root);
    }
}
