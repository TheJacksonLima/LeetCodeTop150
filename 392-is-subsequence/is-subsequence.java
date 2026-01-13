class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) return false;
        int i=0;       

        for(char c : t.toCharArray()){
            if (i< s.length() && s.charAt(i) == c){
                i++;
            }
        }

        return i == s.length();
    }
}