class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int[]res = new int[nums.length-k+1];
        for(int r=0;r<nums.length;r++){
            while(!q.isEmpty() && nums[q.peekLast()]<nums[r]){
                q.pollLast();
            }
            q.offerLast(r);
            if(q.peekFirst()<=r-k){
                q.pollFirst();
            }
            if(r>=k-1){
                res[r-k+1]=nums[q.peekFirst()];
            }
        }
        return res;
        
    }
}
