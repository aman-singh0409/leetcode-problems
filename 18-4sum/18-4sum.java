// Last updated: 8/6/2025, 11:54:12 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;)
            {
                 if (j > i + 1 && nums[j] == nums[j - 1]) { 
                    j++;
                     continue;
                   }
                int p=j+1;
                int q= n-1;
                while(p<q){
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q];
                    if(sum>target){
                        q--;
                    }else if(sum<target){
                        p++;
                    }else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;q--;
                        while (p < q && nums[p] == nums[p - 1]) p++;
                        while (p < q && nums[q] == nums[q + 1]) q--;
                    }
                }j++;
                while(j<n && nums[j]==nums[j-1]){
                    j++;
                }
            }
        }
        return ans;
    }
}