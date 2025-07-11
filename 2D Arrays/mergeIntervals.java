import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start > current[1]){
                merged.add(current);
                current = intervals[i];
            } else {
                current[1] = Math.max(current[1], end);
            }


        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}
