// count frequency of elements in an array
/* 
class Main {
    public static void main(String[] args) {
    int arr[]={1,1,22,3,4,2,5,5,6,7};
    int n=arr.length;
    int []arr1=new int[100];
    for(int i=0;i<n;i++){
        arr1[arr[i]]=arr1[arr[i]]+1;
    }
    boolean[] printed= new boolean [100];
    
    for(int i=0;i<n;i++){
        if(!printed[arr[i]]){
        System.out.print("[" +arr[i]+" "+arr1[arr[i]]+"] ");
        printed[arr[i]]=true;}
    }
    
    }
}
Output: [1 2] [22 1] [3 1] [4 1] [2 1] [5 2] [6 1] [7 1]
iss code me hmne ek array m frequency count krke print krwaya h
hmne ek arr1 array bnaya h jisme hmne arr array ki frequency store krwayi h
fir hmne ek boolean array bnaya h jisme hmne check kiya ki koi element print hua h ya nhi
fir hmne arr array ko loop krke check kiya ki wo element print hua h ya nhi
agr nhi hua to us element ki frequency print krwayi or us element ko printed array m true krdya or print krwa diya

*/