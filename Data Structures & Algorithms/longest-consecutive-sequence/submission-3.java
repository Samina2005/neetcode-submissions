class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null ||nums.length==0){
            return 0;
        }

        // Arrays.sort(nums);
        // int max=1;
        // int temp=1;

        // for(int i=1;i<nums.length;i++){
        //     if( nums[i]!=nums[i-1]){
        //         if(nums[i] == nums[i-1] + 1){
        //             temp++;
        //         }

        //         else{
        //             max=Math.max(max,temp);
        //             temp = 1;
        //         } 
        //     }
                   
        // }

        // if(temp > max){
        //     max = Math.max(temp,max);
        // }
        // return max;


        // METHOD 2

        Set<Integer> s = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        
        int max=0;

        for(int num:s){
            if(!s.contains(num-1)){
                int currNum=num;
                int currLen=1;

                while(s.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }

                max=Math.max(max,currLen);
            }
        }
        return max;

        
    }
}
