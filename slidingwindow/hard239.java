import java.util.LinkedList;
import java.util.List;  
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        List<Integer>list=new LinkedList<>();
       
       for (int i = 0; i <= n - k; i++){
            int bda=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(nums[j]>bda){
                    bda=nums[j];
                }
            }
            list.add(bda);

        }
      
        int []arr1=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr1[i]=list.get(i);
        }

        return arr1;
    }

}



/* /
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();

        int i = 0, j = 0;
        while(j<n){

            while(arr.size()> 0 && arr.get(arr.size() - 1) < nums[j]){
                arr.remove(arr.size() - 1);
            }
            arr.add(nums[j]);

            if(j-i+1 == k){
                ansList.add(arr.get(0));

                if(arr.get(0) == nums[i]){
                    arr.remove(arr.get(0));
                }
                i++;
            }
            j++;
        }

        int [] ans = new int[ansList.size()];
        int ind = 0;
        for(int ele = 0 ; ele<ansList.size() ; ele++){
            ans[ind++] = ansList.get(ele);
        }
        return ans;

    }
}*/