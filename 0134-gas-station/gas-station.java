class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gasSum = 0;
        int costSum = 0;

        int currentSurplus = 0;
        int totalSurPlus = 0;
        int start = 0;

        for(int g : gas){
            gasSum += g;
        }

        for(int c : cost){
            costSum += c;
        }

        if(gasSum < costSum){
            return -1;
        }

        for(int i = 0;i<gas.length;i++){
            int diff = gas[i] - cost[i];
                totalSurPlus += diff;
                currentSurplus += diff;


                if(currentSurplus < 0){
                    start = i+1;
                    currentSurplus = 0;
                }
        }

        return totalSurPlus >= 0 ? start : -1;
        
    }
}
