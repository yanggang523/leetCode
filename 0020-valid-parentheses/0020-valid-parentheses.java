class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(', 
            '}', '{', 
            ']', '['
        );
        if (s == null || s.isEmpty()){
            return false;
        }
        // if (map.containsKey(s.charAt(0))){
        //     return false;
        // }

        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
            
        }
        return stack.isEmpty();
    }
}