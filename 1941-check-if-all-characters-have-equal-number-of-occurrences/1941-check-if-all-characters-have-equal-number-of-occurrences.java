class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int freq=-1;
        for(char ch:map.keySet()){
            if(freq==-1){
                freq=map.get(ch);
            }else if(map.get(ch)!=freq){
                return false;
            }
        }
        return true;
    }
}