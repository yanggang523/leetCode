class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        // int buff = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[i-count] = nums[i];
            }else if (nums[i] == 0){   
                count++;
            }
        }
        for (int i = 0; i < count; i++){
            nums[nums.length - i - 1] = 0;
        }
    }
}