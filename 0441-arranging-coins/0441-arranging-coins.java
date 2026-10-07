class Solution {
    public int arrangeCoins(int n) {
        int low=1;
        int high=n;
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            long coinsneeded=(long) mid*(mid+1)/2;

            if(coinsneeded<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}