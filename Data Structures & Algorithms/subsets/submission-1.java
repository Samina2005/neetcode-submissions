class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length==0){
            return result;
        }
        recur(result,new ArrayList<>(),0,nums);
        return result;

    }

    public static void recur(List<List<Integer>>result, List<Integer>curr, int ind,int[] nums){
        result.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++){
            curr.add(nums[i]);
            recur(result,curr,i+1,nums);
            curr.remove(curr.size()-1);
        }
    }
}
