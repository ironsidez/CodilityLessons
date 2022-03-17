package Lesson4.PermCheck;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        Arrays.sort(A);
        int permutationDigitCounter = 1;

        for(int i : A){
            if(i == permutationDigitCounter){
                permutationDigitCounter++;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
