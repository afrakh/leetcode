class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder reverseString = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--){
            reverseString.append(s.charAt(i));
        }
        if (s.equals(reverseString.toString())){
            return true;
        } else {
            return false;
        }
    }
}
