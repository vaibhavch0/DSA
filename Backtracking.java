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
   isme hmne ek list bnayi h jisme hm sare valid parenthesis store krwayenge
   fir hmne ek backtrack function bnaya h jisme hmne 4 parameter diye
   n jo ki total pairs of parenthesis h
   open jo ki abhi tk kitne open parenthesis use hue h
   close jo ki abhi tk kitne close parenthesis use hue h
   str jo ki abhi tk ka string h
   fir hmne check kiya ki agr str ki length 2*n ke barabar h to hmne str ko list m add kr diya or return kr diya
   fir hmne check kiya ki agr open n se chota h to hmne open ko 1 badhaya or str m ( add krke backtrack function ko call kr diya
   fir hmne check kiya ki agr close open se chota h to hmne close ko 1 badhaya or str m ) add krke backtrack function ko call kr diya
*/

