import java.util.*;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int finalVal = 0;
        int capacity = truckSize;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int i = 0; i < boxTypes.length; i++){
            if (capacity >= boxTypes[i][0]){
                finalVal += boxTypes[i][0] * boxTypes[i][1];
                capacity -= boxTypes[i][0];
            } else {
                finalVal += capacity * boxTypes[i][1];
                break;
            }
        }
        return finalVal;
    }

}