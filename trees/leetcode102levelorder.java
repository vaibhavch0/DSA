
/*
 * 

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        if(root==null){
            return list;
        }

        while(!q.isEmpty()){

            int size=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                level.add(curr.val);

                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}

            }
            list.add(level);
        }
        return list;
    }
}
     102. Binary Tree Level Order Traversal

     is code m hmne level order traversal krwaya h
     level order m hme level by level traverse krna hota h
     agr root null h to empty list return krdo
     fir queue m root add krdo  
     */