// Last updated: 8/6/2025, 11:54:23 AM
class Solution {
    public int reverse(int x) {
        long rem=0;
        while(x!=0){
            int d=x%10;
            rem=(rem*10)+d;
            x=x/10;
        }
        return (rem< Integer.MIN_VALUE || rem>Integer.MAX_VALUE)? 0: (int)rem;
        
    }
}