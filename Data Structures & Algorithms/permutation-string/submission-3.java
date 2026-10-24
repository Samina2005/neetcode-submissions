class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n){
            return false;
        }
        int[]arr = new int[26];
        for(char c:s1.toCharArray()){
            arr[c-'a']++;
        }
        int l=0;
        int seen =m;
        for(int r=0;r<n;r++){
            if(arr[s2.charAt(r)-'a']>0){
                seen--;
            }
            arr[s2.charAt(r)-'a']--;
            if(r-l+1>m){
                if(arr[s2.charAt(l)-'a']>=0){
                    seen++;
                }
                arr[s2.charAt(l)-'a']++;
                l++;
            }
            if(seen==0){
                return true;
            }
        }
        return false;
    }
}
