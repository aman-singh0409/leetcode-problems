// Last updated: 8/6/2025, 11:50:58 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        /*int max=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]-nums[j])*nums[k]>max){
                        max=(nums[i]-nums[j])*nums[k];
                    }
                }
            }
        }        
        return max;*/
        long maxT=0;
        long maxE=0;
        long maxD=0;
        for(int num :nums){
            maxT=Math.max(maxT, maxD*num);
            maxD=Math.max(maxD,maxE-num);
            maxE=Math.max(maxE,num);
        }
        return maxT;
    }
}