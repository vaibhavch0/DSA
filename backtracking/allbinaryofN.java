package backtracking;

public class allbinaryofN {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        genrate(2);
    }
    
   static void genrate(int n){
        
        check("",n);
    }
    static void check( String curr,int n){
        
        if(curr.length()==n){
            System.out.println(curr);
            return;
        }
        
        check(curr+"0",n);
        check(curr+"1",n);
    }
}
