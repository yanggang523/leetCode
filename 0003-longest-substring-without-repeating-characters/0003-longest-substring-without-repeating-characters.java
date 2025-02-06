import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charPool = new HashMap<>();
        // int count = 0;
        int maxCount = 0;
        int window = 0; 


        if (s.isEmpty()){
            return 0;
        }
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (charPool.containsKey(c)){  // 반복되는 부분
                
                if (maxCount < i - window){ // count 새로 갱신 
                    maxCount = i - window;
                }
                window = Math.max(window, charPool.get(c)+1);
                charPool.put(c, i);
            }else{ // 반복 안 되는 부분
                charPool.put(c, i);
            }
        }
        // 다 돌고 나서 마지막 문자 기준으로 한 번 더 계산 
        if (maxCount < s.length() - window){ // count 새로 갱신 
            maxCount = s.length() - window;
        }
        // if (charPool.size() >= 1 && window ==0){
        //     return charPool.size();

        return Math.max(maxCount, 1);

    }
}