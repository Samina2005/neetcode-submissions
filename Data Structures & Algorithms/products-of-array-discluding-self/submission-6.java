class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]arr = new int[n];
        int pre =1;
        for(int i=0;i<n;i++){
            arr[i] = pre;
            pre = pre*nums[i];
        }

        int post =1;
        for(int i=n-1;i>=0;i--){
            arr[i] = post*arr[i];
            post = post*nums[i];
        }
        return arr;
    }
}  
