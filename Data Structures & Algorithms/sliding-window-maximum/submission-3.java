class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        List<Integer> list = new ArrayList<>();
      
        
        while (left <= nums.length - k) { 
            int right = left; // right should start at left for each window
            int maxn = Integer.MIN_VALUE;
            while (right < left + k) {
                maxn = Math.max(maxn, nums[right]);
                right++;  
            }
            list.add(maxn);
            left++;
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
