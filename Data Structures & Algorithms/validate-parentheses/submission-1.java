class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> c = new HashMap<>();

        c.put(')','(');
        c.put(']','[');
        c.put('}','{');
    
    
        for(char cc : s.toCharArray()){
            if(c.containsKey(cc)){
                if(!stack.isEmpty() && stack.peek()==c.get(cc)){
                    stack.pop();
                }else{return false;}
            }else{
                stack.push(cc);
            }
        }
        return stack.isEmpty();
    }
}
