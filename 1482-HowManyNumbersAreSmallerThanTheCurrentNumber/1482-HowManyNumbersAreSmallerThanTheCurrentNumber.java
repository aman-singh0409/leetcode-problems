// Last updated: 8/6/2025, 11:51:52 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}