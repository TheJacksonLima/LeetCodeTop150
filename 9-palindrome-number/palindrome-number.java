class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder xStr1 = new StringBuilder();
        xStr1.append(x);

        String xStr1Rev = new StringBuilder(xStr1.toString()).reverse().toString();
        return xStr1.toString().equals(xStr1Rev);
    }
}