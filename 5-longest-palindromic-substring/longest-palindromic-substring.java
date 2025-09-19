class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2){
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int bestStart = 0;
        int bestLen = 1;

        for(int l = n-1;l>=0;l--)
        {
          for(int r=l;r <n; r++){
            if(s.charAt(l) == s.charAt(r) && (r-l < 3 || dp[l +1][r-1]))
            {
                dp[l][r] = true;
                int len = r - l +1;
                if(len > bestLen){
                    bestLen = len;
                    bestStart = l;
                }
            }
          }
        }     
        return s.substring(bestStart,bestStart+bestLen); 
    }
}