// Last updated: 8/6/2025, 11:54:20 AM
class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int start=0;
        int end= height.length-1;
        while(start<end){
            int width=end-start;
            int h=Math.min(height[start], height[end]);
            int water=width*h;
            ans=Math.max(water, ans);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}