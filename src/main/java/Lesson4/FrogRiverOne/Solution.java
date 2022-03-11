package Lesson4.FrogRiverOne;

import java.util.HashSet;

public class Solution {

    public static int solution(int X, int[] A) {

        HashSet<Integer> leafLocations = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            leafLocations.add(A[i]);

            if(leafLocations.size() == X){
                return i;
            }
        }

        return -1;
    }
}
