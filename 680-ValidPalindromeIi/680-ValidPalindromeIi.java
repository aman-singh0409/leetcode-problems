// Last updated: 8/6/2025, 11:52:18 AM
class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrom(s, left+1, right)|| isPalindrom(s, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrom(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}