class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int [n];

        int maxLeft = height[0];
        for(int i=0;i<n;i++){
            if(height[i]>maxLeft){
                left[i] =height[i];
                maxLeft = height[i];
            }else{
                left[i]= maxLeft;
            }
        }

        int maxRight = height[n-1];
        for(int i=n-1;i>=0;i--){
            if(height[i]>maxRight){
                right[i]=height[i];
                maxRight = height[i];
            }else{
                right[i]= maxRight;
            }
        }

        int ans =0;
        for(int i=0;i<n;i++){
            int w = Math.min(left[i],right[i])-height[i];
            ans+=w;
        }
        return ans;
    }
}
