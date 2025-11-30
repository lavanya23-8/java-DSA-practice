class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int v){
        val = v;
    }
}

public class Inorder {
    static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        inorder(root);
    }
}
