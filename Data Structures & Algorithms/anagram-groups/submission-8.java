class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word :strs){
            char[]a = word.toCharArray();
            Arrays.sort(a);
            String w = new String(a);
            if(!map.containsKey(w)){
                map.put(w,new ArrayList<>());
            }
            map.get(w).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
