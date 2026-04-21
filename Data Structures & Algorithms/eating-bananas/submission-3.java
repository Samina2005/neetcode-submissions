class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        int ans = -1;
        while(low<= high ){
            int mid = low + (high - low)/2;
            int total = count(piles,mid);

            if(total<= h){
                ans = mid;
                high =mid -1;
            }else{
                low = mid +1;
            }

        }
        return ans;
    }

    public static int count(int arr[], int k){
        int c=0;
        for(int i =0;i<arr.length;i++){
            c += Math.ceil((double)arr[i]/k);
        }
        return c;
    } 
}
