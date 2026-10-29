class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int resRow = 0;
        int maxcnt = 0;

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;

            for (int val : mat[i]) {

                cnt += val;

            }
            if (cnt > maxcnt) {
                maxcnt = cnt;
                resRow = i;
            }

        }

        return new int[] { resRow, maxcnt };
    }
}
