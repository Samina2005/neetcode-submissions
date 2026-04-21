class Solution {
    public int maxProfit(int[] prices) {
        int max =0 ;
        int n= prices.length;

        for(int i=n-1;i>=0;i--){
            if(prices[i]>max){
                max= prices[i];
                prices[i] = 0;
            }else{
                prices[i]= max- prices[i];
            }
        }

        int num =0;
        for(int i: prices){
            num = Math.max(num,i);
        }
        return num;

        
    }
}
