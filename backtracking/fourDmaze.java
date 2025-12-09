package backtracking;

public class fourDmaze {
    public static void main(String[] args) {
       int row =3;
       int col=3;
       boolean [][] isvisited= new boolean[row][col]; 
       print(0,0,row-1,col-1,isvisited,"");

    }
    static public void print(int sr,int sc,int er,int ec,boolean[][] isvisited,String s){

        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
       if(isvisited[sr][sc]==true) return;

        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc]=true;

        print(sr+1, sc, er, ec, isvisited, s+"R");
        
        print(sr, sc+1, er, ec, isvisited, s+"D");

        print(sr-1, sc, er, ec, isvisited, s+"U");

        print(sr, sc-1, er, ec, isvisited, s+"L");

        isvisited[sr][sc]=false;
    }
}
