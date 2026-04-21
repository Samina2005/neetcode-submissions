class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];

        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    pro=pro*nums[j];
                }
            }
            result[i]=pro;
        }
        return result;
    }
}  
