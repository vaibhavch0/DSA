public class maxsum {
    public static void main(String[] args) {
        int[] arr={1,-3,4,0,9,5,4};
        int currsum=arr[0];
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(maxsum,currsum);
        }

    System.out.println(maxsum);

    }
}
