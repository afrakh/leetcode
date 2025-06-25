import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() == t.length()){
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

            boolean result = Arrays.equals(sArray, tArray);
            if (result){
                return true;
            } else{
                return false;
            }
        } 
        return false;
    }
}