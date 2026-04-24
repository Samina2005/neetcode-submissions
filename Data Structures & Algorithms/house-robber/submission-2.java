class Solution {
    int[]dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return h(nums,0);
    }

    private int h(int[]nums,int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]= Math.max(nums[i]+h(nums,i+2),h(nums,i+1));
        return dp[i];
    }
}
