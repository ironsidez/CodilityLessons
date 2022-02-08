package Lesson3.PermMissingElem;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        if(A.length == 0){
            return 1;
        }

        Arrays.sort(A);
        int expectedNumber = 1;

        for(int i=0;i<A.length;i++){
            if(A[i] == expectedNumber){
                expectedNumber++;
            } else {
                return expectedNumber;
            }
        }

        return expectedNumber;
    }
}
