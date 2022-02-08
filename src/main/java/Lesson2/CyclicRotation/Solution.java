package Lesson2.CyclicRotation;

public class Solution {
    public static int[] solution(int[] A, int K) {
        int[] rotatedArray = new int[A.length ];
        int rotations = 0;

        if(A.length!=0){
            rotations = determineRotationAmount(A, K);
        }

        for(int i=0;i<A.length;i++){
            if(i<rotations){
                rotatedArray[i] = A[A.length+i-rotations];
            } else {
                rotatedArray[i] = A[i-rotations];
            }
        }
        return rotatedArray;
    }

    public static int determineRotationAmount(int[] array, int rotations) {
            return rotations%array.length;
    }

}
