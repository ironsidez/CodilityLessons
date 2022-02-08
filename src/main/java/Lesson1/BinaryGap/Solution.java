package Lesson1.BinaryGap;

public class Solution {

    public static String convertToBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    public static int solution(int N) {
        String binaryString = convertToBinaryString(N);
        int biggestGap = 0;
        int currentGap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
                currentGap = 0;
            } else {
                currentGap++;
            }
        }

        return biggestGap;
    }
}
