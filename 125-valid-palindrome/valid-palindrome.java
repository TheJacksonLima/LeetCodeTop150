class Solution {
    public boolean isPalindrome(String s) {
        int stringSize = s.length();
        int end = stringSize -1;
        int begin = 0;
        Boolean palindrome = true;

        while(end >= begin){
            Character charBegin = Character.toLowerCase(s.charAt(begin));
            if (!Character.isLetterOrDigit(charBegin)){
                begin+=1;
                continue;
            }
                
            Character charEnd = Character.toLowerCase(s.charAt(end));
            if (!Character.isLetterOrDigit(charEnd)){
                end-=1;
                continue;
            }

            if (charBegin != charEnd){
               palindrome = false;
               break;
            }

            begin+=1;
            end-=1;
        }

        return palindrome;
    }
}