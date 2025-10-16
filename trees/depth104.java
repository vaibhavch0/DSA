/*
 * 
 
public class Solution {
        public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> arr1 = new ArrayList<>();
        if(root==null)return 0;

        q.add(root);

        int count = 0;
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                arr.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
           // arr1.add(arr);

            count++;
        }
        return count;

    }
}
*/