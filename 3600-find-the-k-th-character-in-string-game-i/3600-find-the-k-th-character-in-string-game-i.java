class Solution {
    public char kthCharacter(int k) {
        k--;
        int num = 0;
        while (k > 0){
            k &= k - 1;
            num++;
        }
        return (char)(97 + num);
    }
}