// Last updated: 8/6/2025, 11:52:58 AM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit= new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n= getNextNumber(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    private int getNextNumber(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}