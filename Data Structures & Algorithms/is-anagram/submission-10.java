class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        // Map <Character,Integer> map=new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
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
        // }
        // return true;

        
        // char a[]=s.toCharArray();
        // Arrays.sort(a);
        // char b[]=t.toCharArray();
        // Arrays.sort(b);

        // return Arrays.equals(a,b);


        int arr[] = new int[26];
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     arr[ch-'a']++;
        // }

        // for(int i=0;i<t.length();i++){
        //     char th=t.charAt(i);
        //     arr[th-'a']--;
        // }
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }

        for(char th:t.toCharArray()){
            arr[th-'a']--;
        }
        for(int count:arr){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
















