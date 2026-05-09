class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[] arr = new int[26];
        if(m>n){
            return false;
        }

        for(char c:s1.toCharArray()){
            arr[c-'a']++;
        }
        
        int left =0;
        int seen = m;

        for(int r =0;r<n;r++){
            if(arr[s2.charAt(r)-'a']>0){
                seen--;
            }
            arr[s2.charAt(r)-'a']--;


            if(r-left+1 > m){
                if(arr[s2.charAt(left)-'a']>=0){
                    seen++;
                }
                arr[s2.charAt(left)-'a']++;
                left++;
            }

            if(seen ==0){
                return true;
            }
        }
        return false;

    }
}
