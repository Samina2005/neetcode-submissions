class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(bfs(cost,0),bfs(cost,1));
    }

    public int bfs(int[]cost,int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i] = cost[i]+ Math.min(bfs(cost,i+1),bfs(cost,i+2));
        return dp[i];
    }
}
