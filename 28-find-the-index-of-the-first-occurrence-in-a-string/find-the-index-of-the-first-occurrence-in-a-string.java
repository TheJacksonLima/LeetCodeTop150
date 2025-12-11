class Solution {
    public int strStr(String haystack, String needle) {
        int size = haystack.length();
        int ret = -1;
        for (int i=0;i<size;i++){
            if (haystack.startsWith(needle)){
                ret=i;    
                break;
            }

            haystack = haystack.substring(1);
        }
        return ret;
    }
}