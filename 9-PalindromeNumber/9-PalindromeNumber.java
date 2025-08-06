// Last updated: 8/6/2025, 11:54:22 AM
class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int cp=x;
        while(x>0){
            int d=x%10;
            rem=(rem*10)+d;
            x=x/10;
        }       
        if(rem==cp){
            return true;
        }
        else return false;
    }
}