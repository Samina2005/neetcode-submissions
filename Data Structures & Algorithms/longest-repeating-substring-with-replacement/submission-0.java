class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int n= s.length();
        int ans = 0;


        Map<Character,Integer> map = new HashMap();
        int maxFreq=0;

        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(j)));
            while((j-i + 1) - maxFreq > k ){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            ans = Math.max(ans,j - i + 1);
            j++;
        }
        return ans;
        
        
        
        
    }
}
