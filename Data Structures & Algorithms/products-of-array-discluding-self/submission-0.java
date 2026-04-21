class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int output[]=new int[n];
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    pro=pro*nums[j];
                }

            }
            output[i]=pro;

        }
        return output;
    }
}  
