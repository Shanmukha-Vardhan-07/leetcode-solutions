class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result=new int[nums.length];

        int positiveindex=0;
        int negativeindex=1;
        for(int num:nums){
            if(num>0){
                result[positiveindex]=num;
                positiveindex+=2;
            }
            else{
                result[negativeindex]=num;
                negativeindex+=2;
            }
        }
        return result;
    }
}