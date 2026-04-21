class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int n = s.length();
        int ans =0;
        int hf =0;

        Map<Character,Integer> map = new HashMap<>();

        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            hf = Math.max(hf,map.get(s.charAt(j)));

            if((j-i+1)-hf>k){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
