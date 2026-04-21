class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        return h(nums,0);
    }
    public int h(int[]nums,int i){
        if(i>=nums.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i]= Math.max(nums[i]+h(nums,i+2),h(nums,i+1));
        return memo[i];
    }
}
