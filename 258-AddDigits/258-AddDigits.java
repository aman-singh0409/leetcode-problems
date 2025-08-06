// Last updated: 8/6/2025, 11:52:41 AM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}