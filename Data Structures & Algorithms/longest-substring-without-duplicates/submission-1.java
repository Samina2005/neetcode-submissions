class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int i=0;
        int j=0;
        int len=0;
        int n = s.length();

        while(j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                len= Math.max(len,j-i+1);
                j++;
            }
           
        }
        return len;
    }
}
