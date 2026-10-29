class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int result = 0;

        for(int x : piles){
            high = Math.max(high,x);
        }

        result = high;

        while(low <= high){
            int mid = low + (high-low) /2;

            if(canFinishPile(piles,mid,h)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return result;
        
    }

    private boolean canFinishPile(int[] piles,int k, int hrs){
        long totalHrs = 0;

        for(int pile : piles){
            totalHrs += (pile + k -1) / k;
        }

        return totalHrs <= hrs;
    }
}
