// Last updated: 8/6/2025, 11:53:42 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]+1!=10){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int newDigits[]=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}