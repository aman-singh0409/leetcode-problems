// Last updated: 8/6/2025, 11:53:59 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[p]){
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=temp;
                break;
            }
        }
        reverse(nums, p+1, nums.length-1);
    }
    static void reverse(int nums[], int si, int ei){
        while(si<ei){
            int temp=nums[si];
            nums[si]=nums[ei];
            nums[ei]=temp;
            si++;
            ei--;

        }
    }
}