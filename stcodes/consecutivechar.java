package stcodes;

import java.util.Stack;

public class consecutivechar {

     public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a="axyyxb";
        Stack<Character>st=new Stack<>();
        
        for(char c:a.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }else{
                st.add(c);
            }
        }
        
        
        System.out.print(st);
    }
    
}
//input axyyxb
//output ab
//agr consecutive character same h to usko remove krdo