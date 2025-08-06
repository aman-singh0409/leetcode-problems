// Last updated: 8/6/2025, 11:53:56 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
       // searchIndexfirst(int nums[], int target);
       // searchIndexlast(int nums[], int target);
        arr[0]=searchIndexfirst(nums,target);
        arr[1]=searchIndexlast(nums, target);
        return arr;

    }
     public static int searchIndexfirst(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                result=mid;
                end=mid-1;
            }
            else if (nums[mid] < target) {
                start= mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
    public static int searchIndexlast(int nums[], int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                result=mid;
                start=mid+1;
            }
            else if (nums[mid] < target) {
                start= mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}