package backtracking;

public class permu {

    public static void main(String[] args) {
        String str="abc";

        print(str ,"");
    }
    public static void print (String str , String t){

        if(str.equals("")){
            System.out.println(t);
            return;
        }
        
        for(int i=0;i<str.length();i++){

            char fr=str.charAt(i);
            String left=str.substring(0, i);
            String right=str.substring( i+1);
            String rem= left+right;

            print(rem, t+fr);
            
        }


    }
}
