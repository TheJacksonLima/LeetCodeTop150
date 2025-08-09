class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> strMap = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int sizeS = s.length();

        for(int right = 0; right < sizeS; right++){
            while (strMap.contains(s.charAt(right))){
                strMap.remove(s.charAt(left));
                left++;
            }
            strMap.add(s.charAt(right));
            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
    }
}