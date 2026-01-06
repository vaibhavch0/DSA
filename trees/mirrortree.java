// import javax.swing.tree.TreeNode;

// public class mirrortree {
//     /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root==null){return null;}
//         TreeNode temp=root.right;
//         root.right=root.left;
//         root.left=temp;
        
//         invertTree(root.left);
//         invertTree(root.right);

//         return root;
//     }
// }
// }

// is code me hmn mirror tree ka concept samjhaaya gaya hai
//right subtree ko left subtree se swap kiya gaya hai