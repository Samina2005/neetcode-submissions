class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(i!=j && (nums[i]+nums[j]==target)){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;

        Map <Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int val=target-temp;
            if(map.containsKey(val) && map.get(val) != i){
                return new int[]{i,map.get(val)};
            }
        }
        return null;
    }
}
