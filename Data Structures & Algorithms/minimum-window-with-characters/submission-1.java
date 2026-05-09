class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }

        int[]arr =new int[128];
        for(char c:t.toCharArray()){
            arr[c]++;
        }

        int left = 0;
        int start = 0;
        int count =0;
        int minlen = Integer.MAX_VALUE;

        for(int ri =0;ri<s.length();ri++){
            char r = s.charAt(ri);
            if(arr[r]>0){
                count++;
            }
            arr[r]--;

            while(count==t.length()){
                if(ri-left+1<minlen){
                    minlen = ri-left+1;
                    start = left;
                }
                char l = s.charAt(left);
                arr[l]++;
                if(arr[l]>0){
                    count--;
                }
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
