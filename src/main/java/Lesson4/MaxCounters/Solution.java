package Lesson4.MaxCounters;

public class Solution {

    public static int[] solution(int N, int[] A) {
        int[] counterArray = new int[N];
        int maxCounter = 0;
        int tempMaxCounter = 0;

        for(int operation:A){
            if(isIncrementCounter(N, operation)){
                incrementCounter(counterArray, operation-1);

                if(isCounterNewMax(counterArray[operation-1], tempMaxCounter)) {
                    tempMaxCounter++;
                }
            } else {
                if(tempMaxCounter != 0) {
                    counterArray = new int[N];
                    maxCounter = maxCounter + tempMaxCounter;
                    tempMaxCounter = 0;
                }
            }
        }
        incrementByMaxCounters(counterArray, maxCounter);
        return counterArray;
    }

    private static boolean isCounterNewMax(int counterArray, int tempMaxCounter) {
        return tempMaxCounter < counterArray;
    }

    private static boolean isIncrementCounter(int N, int operation) {
        return operation <= N;
    }


    private static void incrementCounter(int[] counterArray, int i) {
        counterArray[i] = counterArray[i] + 1;
    }

    private static void incrementByMaxCounters(int[] counterArray, int maxCounter) {
        for (int j = 0; j < counterArray.length; j++) {
            counterArray[j] = counterArray[j] + maxCounter;
        }
    }
}
