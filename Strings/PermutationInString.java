import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Array[] = new int[26];

        for (int i = 0; i < s1.length(); i++){
            s1Array[s1.charAt(i) - 'a']++;
        }

        for (int si = 0; si < s2.length(); si++){
            int windowSize = s1.length();
            int idx = si;
            int windIdx = 0;

            int windowArray[] = new int[26];

            while (windIdx < windowSize && idx < s2.length()){
                windowArray[s2.charAt(idx) - 'a']++;
                idx++; 
                windIdx++;
        }
        if (Arrays.equals(s1Array, windowArray)){
            return true;
        }
        }
        return false;
    }
}
