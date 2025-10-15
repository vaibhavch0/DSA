// 103. Binary Tree Zigzag Level Order Traversal
/*class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        if(root==null){
            return list;
        }
        int count=1;
        while(!q.isEmpty()){
          
            int size=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                level.add(curr.val);

                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            if(count%2!=0){
                list.add(level);
            }else{
                Collections.reverse(level);
                list.add(level);
            }
            count++;
            
        }
        return list;
    }
}
    same peechle wale ki tarah h bas isme hmne zigzag krwaya h
    isme hmne count variable banaya h jisme hmne 1 se start krdia h
    fir agr count odd h to list m level add krdo
    agr count even h to level ko reverse krdo fir list m add krdo
    fir count ko increment krdo 
    */