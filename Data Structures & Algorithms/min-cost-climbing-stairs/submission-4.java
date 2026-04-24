class Solution {
    int[]dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(h(cost,0),h(cost,1));
    }

    private int h(int[]cost,int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i] = cost[i] +Math.min(h(cost,i+1),h(cost,i+2));
        return dp[i];
    }
}
