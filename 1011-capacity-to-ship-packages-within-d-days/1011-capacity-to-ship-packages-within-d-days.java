class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        for(int wt:weights){
            low=Math.max(low,wt);
        }
        int high=0;
        for(int wt:weights){
            high+=wt;
        }
        int ans=high;

        while(low<=high){
            int mid=(low+high)/2;

            int reqdays=1;
            int currentwt=0;

            for(int wt:weights){
                if(currentwt+wt>mid){
                    reqdays++;
                    currentwt=wt;
                }
                else{
                    currentwt+=wt;
                }
            }
            if(reqdays<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}