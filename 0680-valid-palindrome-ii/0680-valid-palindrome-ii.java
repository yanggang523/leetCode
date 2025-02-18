class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if (a != b){
                break;
            }
            left++;
            right--;
        }
        return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
    }
    private boolean isPalindrome(String s, int left, int right){
        while(left <= right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if (a != b){
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}