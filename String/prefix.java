// package String;

// public class prefix {
//     public String longestCommonPrefix(String[] strs) {
//          if (strs.length == 0) return "";
//         String str=strs[0];
//         String pr="";
//         for(int i=0;i<strs.length;i++){
//             String s=strs[i];
//             pr="";
//             for(int j=0;j<s.length() && j<str.length();j++){
//                 if(s.charAt(j)!=str.charAt(j)){
//                     break;
//                 }
//                 pr+=s.charAt(j);
//             }
//              str = pr;
//             if (str.equals("")) return "";
//         }
//         return pr;
//     }
// }

// is common prefix is code me hamne sabhi strings ke beech ka common prefix nikaala hai.
// logic hai ki hum pehle string ko base maan kar chalte hain aur baaki strings ke saath compare karte hain.