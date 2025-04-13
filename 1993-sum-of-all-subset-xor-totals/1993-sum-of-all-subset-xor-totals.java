class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    private int dfs(int[] nums, int index, int current){
        if (nums.length == index){
            return current;
        }
        return dfs(nums, index + 1, current) + dfs(nums, index + 1, nums[index]^current);
    }
}