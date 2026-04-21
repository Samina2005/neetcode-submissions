class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n==0){
            res.add(new ArrayList<>());
            return res;
        }
        
        List<List<Integer>> s = subsets(Arrays.copyOfRange(nums, 1, n));

        // Subsets without nums[0]
        res.addAll(s);

        // Subsets with nums[0]
        for (List<Integer> t : s) {
            List<Integer> h = new ArrayList<>();
            h.add(nums[0]);
            h.addAll(t);
            res.add(h);
        }

        return res;

        
        
    }
}
