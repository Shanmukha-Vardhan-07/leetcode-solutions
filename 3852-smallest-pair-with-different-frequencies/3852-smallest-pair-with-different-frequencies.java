class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int x=-1;
        int y=-1;
        for(int a:map.keySet()){
            for(int b:map.keySet()){
                if(a<b && !map.get(a).equals(map.get(b))){
                    if(x==-1 || a<x||(a==x&&b<y)){
                        x=a;
                        y=b;
                    }
                }
            }
        }
        return new int[]{x,y};   
        
    }
}