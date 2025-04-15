class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> pool = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            // 값 추가
            if (pool.containsKey(ch)){
                pool.put(ch, pool.get(ch) + 1);
            }else{
                pool.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char cht = t.charAt(i);
            if (pool.containsKey(cht)){
                if (pool.get(cht) == 1){
                    pool.remove(cht);
                }else {
                    pool.put(cht, pool.get(cht) - 1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}