class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> pool = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (pool.contains(nums[i])){
                return true;
            }
            pool.add(nums[i]);
        }
        return false; 
    }
}