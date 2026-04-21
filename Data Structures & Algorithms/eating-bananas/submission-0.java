class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = -1;

        while(low<=high){
            int mid = low +(high - low)/2;
            int total_hour = countHour(piles,mid);

            if(total_hour<= h){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }    
        }
        return ans;
    }

    public static int countHour(int arr[],int k){
        int total =0;
        for(int i=0;i<arr.length;i++){
            total += Math.ceil((double)arr[i]/k);
        }
        return total;
    }
}
