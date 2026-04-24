class Solution {
    int[]dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans= h(coins,amount);
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }

    private int h(int[]coins,int amount){
        if(amount ==0){
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int mini = Integer.MAX_VALUE;
        for(int coin:coins){
            if(amount-coin>=0){
                int res = h(coins,amount-coin);
                if(res!=Integer.MAX_VALUE){
                    mini = Math.min(mini,1+res);
                }
            }
        }
        dp[amount] = mini;
        return dp[amount];
    }
}
