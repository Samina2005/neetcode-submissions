class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int arr[]=new int[26];

        if(m>n){
            return false;
        }

        //count characters in s1
        for(char c: s1.toCharArray()){
            arr[c-'a']++;
        }

        int left=0;
        int right=0;
        int seen = m;

        while(right<n){
            if(arr[s2.charAt(right)-'a']>0){
                seen--;
            }

            arr[s2.charAt(right)-'a']--;
            right++;

            if(seen==0){
                return true;
            }

            if(right - left == m){
                if(arr[s2.charAt(left)-'a']>=0){
                    seen++;
                }

                arr[s2.charAt(left)-'a']++;
                left++;
            }
        }
        return false;
    }
}
