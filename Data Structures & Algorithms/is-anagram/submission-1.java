class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        // char[] a= s.toCharArray();
        // char[] b= t.toCharArray();

        // Arrays.sort(a);
        // Arrays.sort(b);

        // if(Arrays.equals(a,b)){
        //     return true;
        // }else{
        //     return false;
        // }
        
        Map <Character,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char th=t.charAt(i);
            if(map.containsKey(th)){
                map.put(th,map.get(th)-1);
            }
        }

        for(int num: map.values()){
            if(num !=0){
                return false;
            }
        }
        return true;
    }
}
















