class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int fr = 0, lr = m-1, fc = 0, lc = n-1;
        int tnl = m*n;
        while(ans.size()<tnl){
            for(int j =fc;j<=lc;j++)
            ans.add(arr[fr][j]);
            fr++;
            if(ans.size()==tnl) break;
            for(int i=fr;i<=lr;i++)
            ans.add(arr[i][lc]);
            lc--;
            if(ans.size()==tnl) break;
            for(int j = lc;j>=fc;j--)
            ans.add(arr[lr][j]);
            lr--;
            if(ans.size()==tnl) break;
            for(int i=lr;i>=fr;i--)
            ans.add(arr[i][fc]);
            fc++;
        }
        return ans;
    }
}