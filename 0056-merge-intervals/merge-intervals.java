class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        List<int[]> result = new ArrayList<>();


        for(int[] arr : intervals){

            if(result.isEmpty() || result.get(result.size()-1)[1] < arr[0]){
                result.add(new int[]{arr[0],arr[1]});
            }else{
                result.get(result.size()-1)[1] = 
                Math.max(result.get(result.size()-1)[1],arr[1]);
            }

        }

        return result.toArray(new int[result.size()][]);
        
        
    }
}
