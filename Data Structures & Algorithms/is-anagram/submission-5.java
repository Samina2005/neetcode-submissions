class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        // Map <Character,Integer> map = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch= s.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch)+1);
        //     }else{
        //         map.put(ch,1);
        //     }
        // }

        // for(int i=0;i<t.length();i++){
        //     char th= t.charAt(i);
        //     if(map.containsKey(th)){
        //         map.put(th,map.get(th)-1);
        //     }
        // }

        // for(int m:map.values()){
        //     if(m!=0){
        //         return false;
        //     }

        // }return true;

        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }

        for(int count:arr){
            if(count!=0){
                return false;
            }
        }
        return true;
        
    }
}
















