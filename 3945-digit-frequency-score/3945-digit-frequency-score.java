class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        return sum;
    }
}