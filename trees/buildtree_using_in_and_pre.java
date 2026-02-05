// import java.util.HashMap;

// import javax.swing.tree.TreeNode;

// public class buildtree_using_in_and_pre {
    

//   public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//       }
// class Solution {
//     static int preindex;
//     static HashMap<Integer,Integer>map;
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         preindex=0;
//         map=new HashMap<>();
//         int m=inorder.length;
//         for(int i=0;i<m;i++){
//             map.put(inorder[i],i);
//         }
//         return build(preorder,inorder,0,m-1);
//         }
//     static public TreeNode build(int[]preorder,int[]inorder,int start,int end){
//         if(start>end){
//             return null;
//         }
//         TreeNode root= new TreeNode(preorder[preindex++]);
//         int idx=map.get(root.val);
//         root.left=build(preorder,inorder,start,idx-1);
//         root.right=build(preorder,inorder,idx+1,end);
//         return root;
//     }
// }
// }
// is code me hamne inorder aur preorder traversal se binary tree ko construct kiya hai. using hashmap inorder traversal ke elements ke indices ko store karne ke liye, j
// isse hame O(1) time me kisi bhi element ka index mil jata hai. preindex variable preorder array me current root 
// node ko track karta hai. build function recursively left aur right subtrees ko construct karta hai.