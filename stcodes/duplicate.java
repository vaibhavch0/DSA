package stcodes;

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={1,2,3,6,6,3,1};
        Set<Integer>st=new HashSet<>();
        
        int arr1[]=duplicate(arr);
        
       for(int i:arr1){
           if(i!=0){
           st.add(i);}
       }
        System.out.print(st);
        
    }
    static int[] duplicate(int arr[]){
        int n=arr.length;
        int arr1[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]=arr1[arr[i]]+1;
        }
        
        int []arr2= new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr1[arr[i]]>1){
                arr2[i]=arr[i];
            }
        }
        return arr2;
    }
}
//input 1 2 3 6 6 3 1
//output 136
//agr element duplicate h to usko output m show krna h