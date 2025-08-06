// Last updated: 8/6/2025, 11:51:49 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[]= new int[nums.length];
        for(int i=0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];
        }
        return result;
    }
}