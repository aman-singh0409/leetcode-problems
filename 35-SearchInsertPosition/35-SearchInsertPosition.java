// Last updated: 8/6/2025, 11:53:55 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                pos=i;
            }
            else if(nums[i]<target){
                pos=i+1;
            }
        }
        return pos;
    }
}