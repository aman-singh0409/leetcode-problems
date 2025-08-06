// Last updated: 8/6/2025, 11:53:58 AM
class Solution {
    public int search(int[] nums, int target) {
        for(int i =0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}