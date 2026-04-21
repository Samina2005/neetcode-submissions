class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];

        // for(int i=0;i<n;i++){
        //     int pro=1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             pro=pro*nums[j];
        //         }
        //     }
        //     result[i]=pro;
        // }
        // return result;

        int prepro=1;
        for(int i=0;i<n;i++){
            result[i]=prepro;
            prepro=prepro*nums[i];
        }

        int postpro=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*postpro;
            postpro=postpro*nums[i];
        }

        return result;


    }
}  
