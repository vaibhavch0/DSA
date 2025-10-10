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
