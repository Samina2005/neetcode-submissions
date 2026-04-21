class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0,target);
        return result;
        
    }

    public static void backtrack(List<List<Integer>> result , List<Integer>curr, int[] nums,int ind,int target){
        if(ind==nums.length){
            if(target==0){
                result.add(new ArrayList<>(curr));
            }
            return ;
        }

        if(nums[ind]<= target){
            curr.add(nums[ind]);
            backtrack(result,curr,nums,ind,target-nums[ind]);
            curr.remove(curr.size()-1);
        }
        backtrack(result,curr,nums,ind+1,target);
    }
}
