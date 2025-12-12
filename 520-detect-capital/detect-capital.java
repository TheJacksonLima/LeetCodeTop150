class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allCapital = true;
        boolean allLower = true;

        for (char c: word.toCharArray()){
            if (!Character.isUpperCase(c)) allCapital = false;
            if (!Character.isLowerCase(c)) allLower = false;
        }

        boolean firstUpperRestLower = Character.isUpperCase(word.charAt(0));

        for(int i=1; i < word.length();i++){
            if (!Character.isLowerCase(word.charAt(i))) {
                firstUpperRestLower = false;
                break;
            }

        }
        
        
        return allCapital || allLower || firstUpperRestLower;
    }
}