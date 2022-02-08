package Lesson3.FrogJmp;

public class Solution {
    public static int solution(int X, int Y, int D) {
        int distance = Y - X;

        if(distance < 0){
            return 0;
        }

        return (int) Math.ceil((double) distance / D);
    }
}
