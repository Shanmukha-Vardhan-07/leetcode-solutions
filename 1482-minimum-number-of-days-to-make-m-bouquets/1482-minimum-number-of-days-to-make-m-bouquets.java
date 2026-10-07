class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long totalflowers=(long) m*k;

        if(totalflowers>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int num:bloomDay){
            low=Math.min(low,num);
        }
        for(int num:bloomDay){
            high=Math.max(high,num);
        }
        int ans=high;

        while(low<=high){
            int mid=(low+high)/2;

            int bouquets=0;
            int flowers=0;

            for(int day:bloomDay){
                if(day<=mid){
                    flowers++;

                    if(flowers==k){
                        bouquets++;
                        flowers=0;
                    }
                }
                else{
                    flowers=0;
                }
            }
            if(bouquets>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}