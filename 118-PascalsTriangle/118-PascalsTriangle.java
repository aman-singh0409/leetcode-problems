// Last updated: 8/6/2025, 11:53:15 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> rows= new ArrayList<>();
            for(int j=0;j<=i;j++){
                rows.add(combination(i,j));
            }
            triangle.add(rows);
        }
        return triangle;
    }
    private int combination(int n, int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i)/(i+1);
        }
        return res;
    }
}