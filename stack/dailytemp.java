import java.util.Stack;

public class dailytemp {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st = new Stack<>();
        int[]arr=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int count=0;
        while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
            int index=st.pop();
            arr[index]=i-index;
        }
        st.push(i); 
        }
        return arr; 
    }
}
    }

    //leetcode daily temperature