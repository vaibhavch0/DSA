    // package String;

    // import java.util.HashSet;

    // public class longestsubstring {
    //     public int lengthOfLongestSubstring(String s) {
    //         int l=0;
    //         int r=0;
    //         int maxlen=0;
    //         int max=0;
    //         int n=s.length();
    //        HashSet<Character>set= new HashSet();

    //        while(r<n){
    //         if(!set.contains(s.charAt(r))){
    //             set.add(s.charAt(r));
            
    //             max=r-l+1;
    //             r++;
    //             if(max>maxlen){
    //                 maxlen=max;
    //             }
                
    //         }else{
    //             set.remove(s.charAt(l));
    //             l++;
    //         }
    //        }



    //         return maxlen;
    //     }
    // }
    // }
// iscode me humne longest substring without repeating characters ka length nikaala hai.    
// is code me humne sliding window technique ka use kiya hai.
// logic ye hai ki hum do pointers ka use karte hain, ek left aur ek right pointer. aur
// hum right pointer ko aage badhate hain aur jab tak character unique hai tab tak length nikaalte hain.
// agar character repeat hota hai to hum left pointer ko aage badhate hain.