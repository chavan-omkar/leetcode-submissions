class Solution {
    public int numberOfSubstrings(String s) {

        // HashMap<Character,Integer>map = new HashMap<>(3);
        // map.put('a',1);
        // map.put('b',1);
        // map.put('c',1);

        int count = 0;
        int n = s.length();
        int left = 0;
        int right = 0;

        int countA = 0;
        int countB = 0;
        int countC = 0;

        while (right < n) {

            char c = s.charAt(right);

            if (c == 'a')
                countA++;
            if (c == 'b')
                countB++;
            if (c == 'c')
                countC++;

            while (countA > 0 && countB > 0 && countC > 0) {
                count += (n - right);

                char c1 = s.charAt(left);

                if (c1 == 'a')
                    countA--;
                if (c1 == 'b')
                    countB--;
                if (c1 == 'c')
                    countC--;

                left++;

            }

            right++;
        }
        return count;
    }

}
