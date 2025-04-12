class Solution {
    public void reverseString(char[] s) {
        char f = 0;
        char b = 0;
        for (int i = 0; i < s.length/2; i++){
            f = s[i];
            b = s[s.length-i-1];
            s[i] = b;
            s[s.length-i-1] = f;
        }
    }
}