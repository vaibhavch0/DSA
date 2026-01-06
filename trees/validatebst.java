// import javax.swing.tree.TreeNode;

// public class validatebst {
//     public boolean isValidBST(TreeNode root) {
//         return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
//     }
//     public boolean check(TreeNode root,long min,long max){
//         if (root==null){return true;}
//         if(root.val<=min || root.val>=max){
//             return false;
//         }
//         return check(root.left,min,root.val) && check(root.right,root.val,max);
//     }
// }
// // 
// ye code bst ko validate krta h ki given tree bst h ya nhi logic h ki agar
// left subtree ki saari values root se choti honi chahiye aur right subtree ki saari values root se badi honi chahiye
// agar ye condition satisfy hoti h to tree bst h