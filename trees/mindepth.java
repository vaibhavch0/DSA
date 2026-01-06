// public class mindepth {
//     public int minDepth(TreeNode root) {
//         if (root == null) return 0;
//         if (root.left == null) return minDepth(root.right) + 1;
//         if (root.right == null) return minDepth(root.left) + 1;
//         return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//     } 
// }
// is code check kiya h ki agr left child null h to right child ki depth return karega
// aur agar right child null h to left child ki depth return karega
// agar dono child present h to dono ki depth ka min return karega
// 2

/*\
  3
   \
    4
     \
      5
       \
        6

        minDepth(6) = 1
minDepth(5) = 1 + 1 = 2
minDepth(4) = 1 + 2 = 3
minDepth(3) = 1 + 3 = 4
minDepth(2) = 1 + 4 = 5

*/