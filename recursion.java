//reverse array using recursion

/*
class Main {
    public static void print(int N[], int n){
        if(n<0){
            return;
        }
        System.out.print(N[n] +" "+n+" ");
        print(N,n-1);
    }
    public static void main(String[] args) {
        
        int []arr={1,2,3,4,5,6,7,8,9,90};
        print(arr,10-1);
    }
} 
Output: 90 9 9 8 8 7 7 6 6 5 5 4 4 3 3 2 2 1 1 0
iss code me bss simply hmne recursion ka use krke array ko reverse print krwaya h or index bhi print krwaya h index ko check kiya ki wo jab tk 0 se bda h tab tk print krwate raho
jaise hi chota hojaye return krdo or sath me function ko call krke usme ek index ko kam krte raho and main m bhi n-1 krke call krdo
*/

//palindrome array
/* 
class Main {
    public static boolean checkit(int arr[],int start, int end){
        if(start>end){
            return true;
        }
        if(arr[start]!=arr[end]){
            return false;}
        
        return checkit(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        
        int []arr={1,2,2,1,0};
       int end=arr.length-1;
       int start=0;
       boolean res=checkit(arr,start,end);
       if(res){
           System.out.println("palin");
       }else{
           System.out.println("not palin");
       }
    }
} 
Output: not palin
iss code me hmne check kiya ki array palindrome h ya nhi
uske liye hmne start or end index le rkhe h or check kiya ki start or end index pr jo value h wo same h ya nhi
agr same nhi h to false return krdo agr same h to function ko call krke start ko 1 se bdhao or end ko 1 se ghatao
base case me hmne check kiya ki start end se bda ho gya to true return krdo
or main m hmne function ko call krke uska result ek boolean variable m store krwaya or uske hisab se print krwaya ki palin h ya nhi
*/


//fibonaci
/* 
class Solution {
    public int fib(int n) {
        //your code goes here
        if(n==0)return 0;
        if(n==1)return 1;

        return fib(n-1)+fib(n-2);

    }
}
Output: Fibonacci number at position n
iss code me hmne fibonacci number nikalne ka code likha h
uske liye hmne base case me check kiya ki agr n 0 h to 0 return krdo agr n 1 h to 1 return krdo
agr n 0 ya 1 nhi h to function ko call krke n-1 or n-2 krke unka sum return krdo
isse hm fibonacci number nikal sktete h
*/