class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,target,0);
        return list;
    }

    public static void backtrack(List<List<Integer>>result,List<Integer>curr,int[]arr,int target,int idx){
        if(idx==arr.length ){
            if(target==0){
                result.add(new ArrayList<>(curr));
            }
            return ;
        }

        if(arr[idx]<=target){
            curr.add(arr[idx]);
            backtrack(result,curr,arr,target-arr[idx],idx);
            curr.remove(curr.size()-1);
        }
        backtrack(result,curr,arr,target,idx+1);
    }
}
