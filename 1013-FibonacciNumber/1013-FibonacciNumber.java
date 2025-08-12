// Last updated: 8/12/2025, 3:11:32 PM
class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
}