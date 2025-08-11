class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        int size = s.length();
        if((size <= 1) || ((size %2) != 0)) {
            return false;
        }

        for(Character c: s.toCharArray()){
            if (c == ')'){
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if (c == ']'){
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            else if (c == '}'){
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
            else{
              stack.push(c);
            }
        }
        return stack.isEmpty();
    }
        
}