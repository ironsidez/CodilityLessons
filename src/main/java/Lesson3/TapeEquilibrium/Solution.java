package Lesson3.TapeEquilibrium;

public class Solution {
    public static int solution(int[] A) {
        int arraySum = getArraySum(A);
        int leftSum = 0;
        int smallestAbsoluteDifference = 5000;
        int currentAbsoluteDifference;

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            currentAbsoluteDifference = getAbsoluteDifference(leftSum, arraySum);
            if (currentAbsoluteDifference < smallestAbsoluteDifference) {
                smallestAbsoluteDifference = currentAbsoluteDifference;
            }
        }

        return smallestAbsoluteDifference;
    }

    private static int getArraySum(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        return sum;
    }

    private static int getAbsoluteDifference(int leftSum, int arraySum) {
        int rightSum = arraySum - leftSum;

        return Math.abs(leftSum - rightSum);
    }
}
