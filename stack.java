//sort a stack gfg question
/* 

 
 class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        // Stack<Integer>st =new Stack<>();
        ArrayList<Integer>arr=new ArrayList<>();
        
        while(!st.isEmpty()){
            
        arr.add(st.pop());
    }
    
    Collections.sort(arr);
    for( int i :arr){
        st.push(i);
    }
    
    
}
}

isme hmne stack ko sort krna h to sbse phle hmne stack ko pop krke ek arraylist m dal diya
fir hmne arraylist ko sort kr diya
fir hmne arraylist ke elements ko stack m push kr diya
*/

//503 . next greater element II
/*

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            if (i < n && !st.isEmpty()) {
                arr[i] = st.peek();
            }
            st.push(num);
        }

        return arr;
    }
}

isme humne next greater element ko find krna h
isme humne stack ka use kiya h
sabse phle hmne ek array banaya jisme hmne -1 fill kr diya
fir hmne stack banaya   

*/  
// 503 