package String;

public class palindrom {
     public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder(a).reverse();
        return a.equals(rev.toString());
    } 
}
