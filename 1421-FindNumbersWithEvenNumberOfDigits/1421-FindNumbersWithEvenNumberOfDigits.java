// Last updated: 8/6/2025, 11:51:55 AM
class Solution {
    public int findNumbers(int[] nums) {
        int ct=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]>0){
                int d=nums[i]%10;
                nums[i]=nums[i]/10;
                c++;
            }
            if(c%2==0){
                ct++;
            }
        }
        return ct;
    }
}