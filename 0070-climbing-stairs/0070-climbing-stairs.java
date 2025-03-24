class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        return che(n);
    }

    public int che(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (memo[n] == 0){
            memo[n] = che(n - 1) + che(n -2);
        }
        return memo[n];
    }
}