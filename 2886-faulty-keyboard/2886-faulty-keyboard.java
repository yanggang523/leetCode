class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char k = s.charAt(i);
            if (k == 'i'){
                ans.reverse();
            }else{
                ans.append(k);
            }
        }
        return ans.toString();
    }
}