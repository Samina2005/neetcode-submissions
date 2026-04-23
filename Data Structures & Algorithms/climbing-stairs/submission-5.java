class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f_rec(n,dp);
        
    }

    public int f_rec(int n,int[] dp){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = f_rec(n-1,dp)+f_rec(n-2,dp);
        return dp[n];
    }
}
