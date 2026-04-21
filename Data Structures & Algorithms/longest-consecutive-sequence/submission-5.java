class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }

        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        int max=0;
        for(int num:s){
            if(!s.contains(num+1)){
                int curr = num;
                int len =1;

                while(s.contains(curr-1)){
                    curr--;
                    len++;
                }
                max = Math.max(max,len);
            }
            
        }
        return max;
    }
}
