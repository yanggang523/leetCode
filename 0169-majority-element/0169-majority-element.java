class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxNum = 0;
        int maxTimes = 0;
        for (int i = 0; i < nums.length; i++){
            if (count.containsKey(nums[i])){
                count.put(nums[i], count.get(nums[i])+1);
            }else{
                count.put(nums[i], 1);        
            }
            if (count.get(nums[i]) > maxTimes){
                maxNum = nums[i];
                maxTimes = count.get(nums[i]);
            }
        } 
        return maxNum; 
    }
}