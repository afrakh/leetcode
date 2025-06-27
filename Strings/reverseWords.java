import java.util.*;
class Solution {
    public String reverseWords(String s) {

        StringBuilder reverseSb = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--){
            reverseSb.append(s.charAt(i));
        }
        String reversed = reverseSb.toString();
        String ans = "";

        for (int i = 0; i < reversed.length(); i++){
            StringBuilder word = new StringBuilder("");
            while (i < reversed.length() && reversed.charAt(i) != ' '){
                word.append(reversed.charAt(i));
                i++;
            } 
            String str = word.reverse().toString();
            ans += " " + str;

            while (i < reversed.length() && reversed.charAt(i) == ' ') {
                i++;
            } i--;

        }
        ans = ans.trim();
        return ans;
    }
}
