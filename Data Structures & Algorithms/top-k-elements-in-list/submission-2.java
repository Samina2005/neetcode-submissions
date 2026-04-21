class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        List<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;

    }
}
