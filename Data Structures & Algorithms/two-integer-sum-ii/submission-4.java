class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int first=0;
        // int last=numbers.length-1;

        // while(first<last){
        //     if(numbers[first]+numbers[last]==target){
        //         return new int[]{first+1,last+1};
        //     }else if(numbers[first]+numbers[last]>target){
        //         last-=1;
        //     }else if(numbers[first]+numbers[last]<target){
        //         first+=1;
        //     }

        // }
        // return numbers;

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target && i<j){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
}
