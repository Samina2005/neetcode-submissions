class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        String[] arr= strs;
        Map <String, List<String>> map =new HashMap<> ();
        
        for(int i=0;i<arr.length;i++){
            char[] ch =arr[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }


        return new ArrayList<>(map.values());
    }
}
