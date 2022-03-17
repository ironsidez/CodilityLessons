package Lesson4.MissingInteger;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {

        Arrays.sort(A);
        int smallestPostiveNumberCounter = 1;

        //Using binary sort to find 0 would probably be faster most of the time as the array is already sorted, but seems overkill for the assignment
        for (int i : A) {
            if (i > smallestPostiveNumberCounter) {
                return smallestPostiveNumberCounter;
            } else if (i == smallestPostiveNumberCounter) {
                smallestPostiveNumberCounter++;
            }
        }

        return smallestPostiveNumberCounter;
    }
}
