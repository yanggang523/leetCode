class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> que = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            if (que.containsKey(nums[i]) && Math.abs(que.get(nums[i]) - i) <= k){ // 1번 조건 해당되는 경우 (=같은 값을 찾음)
                return true;
            }else{ // 1번 조건 미해당 (=같은 값을 찾지 못함)
                que.put(nums[i], i);             
            }
        }
        return false;
    }
}