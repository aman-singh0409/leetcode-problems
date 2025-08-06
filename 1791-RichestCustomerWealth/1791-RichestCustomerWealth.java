// Last updated: 8/6/2025, 11:51:45 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                //ans[i]=sum;
            }
            ans[i]=sum;
        }
        int maximum=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>maximum){
                maximum=ans[i];
            }
        }
        return maximum;
    }
}