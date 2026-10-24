class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int lm=0,rm=0,res=0;
        while(l<r){
            if(height[l]<height[r]){
                lm = Math.max(lm,height[l]);
                res = res+lm-height[l++];
            }else{
                rm = Math.max(rm,height[r]);
                res = res+rm-height[r--];
            }
        }
        return res;
    }
}
