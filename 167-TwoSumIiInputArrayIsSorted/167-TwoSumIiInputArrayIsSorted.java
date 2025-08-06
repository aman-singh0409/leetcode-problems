// Last updated: 8/6/2025, 11:53:02 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int last=numbers.length-1;
        while(start< last){
            int sum=numbers[start]+numbers[last];
            if(sum==target){
                return new int[] {start+1, last+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                last--;
            }
        }
        return new int[]{};
    }
}


// used two pinters approach to solve this question.....