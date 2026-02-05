package binary srch;

public class diameter {
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        dia=Math.max(dia,left+right);
        
        return 1+Math.max(left,right);
    }
}
// This code calculates the diameter of a binary tree, which is the length of the longest path between any two nodes in the tree.
