class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set <Integer> st=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     st.add(nums[i]);
        // }

        // if(st.size()==nums.length){
        //     return false;
        // }
        // return true;ums
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }return false;
    }
}