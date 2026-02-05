public class priffixsum {
    public static void main(String[] args) {
     
        int[] arr = {2, 4, 6, 8, 10};
int l = 1, r = 3;


int n = arr.length;
int[] prefix = new int[n + 1];

for (int i = 0; i < n; i++) {
prefix[i + 1] = prefix[i] + arr[i];
}
int sum = prefix[r + 1] - prefix[l];

System.out.println(sum);
    
}
}
