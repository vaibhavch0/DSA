// backtracking ka question hai     generate parenthesis 22
/* 
class Solution {
    ArrayList<String>list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
      backtrack(n,0,0,"");
      return list;
        
    }
   public void backtrack(int n,int open,int close,String str){
    if(str.length()==2*n){
        list.add(str);
        return;
    }
    if(open<n){
        backtrack(n,open+1,close,str+"(");
    }
    if(close<open){
        backtrack(n,open,close+1,str+")");
    }
   }
}
*/