public class longestsubstringkdictinct {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int []freq= new int[26];
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                if(check(freq,k)){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static boolean check(int[]freq,int k){
        for(int i:freq){
            if(i>0 && i<k){
                return false;
            }
        }
        return true;
    }
}

