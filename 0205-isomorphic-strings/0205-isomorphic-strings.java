class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Integer, Integer> poolS2T = new HashMap<>();
        HashMap<Integer, Integer> poolT2S = new HashMap<>();

        for(int i = 0; i < s.length(); i++){ // 전체 String 1회 탐색 
            int indexS = s.charAt(i);
            int indexT = t.charAt(i);
            if (!poolS2T.containsKey(indexS) && !poolT2S.containsKey(indexT)){
                poolS2T.put(indexS, indexT);
                poolT2S.put(indexT, indexS);
            }
            if (!poolS2T.containsKey(indexS) || !poolT2S.containsKey(indexT)){
                return false;
            }
            
            if (poolS2T.get(indexS) != indexT || poolT2S.get(indexT) != indexS ){
                return false;
            }
        }
        return true;
    }
}