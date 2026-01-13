class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if s is None or t is None:
            return False
        i=0
        for c in t:
            if i<len(s) and s[i] == c:
                i+=1
                
        return i == len(s)
