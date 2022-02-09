package Lesson4.MaxCounters;

import org.junit.jupiter.api.Test;

import static Lesson4.MaxCounters.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForSmallestArrays() {
        int amountOfCounters = 1;
        int[] operationArray = {1};
        int[] expected = {1};

        int[] result = solution(amountOfCounters, operationArray);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForSmallestArraysMaxCounter() {
        int amountOfCounters = 1;
        int[] operationArray = {2};
        int[] expected = {0};

        int[] result = solution(amountOfCounters, operationArray);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForOneCounterManyOperations() {
        int amountOfCounters = 1;
        int[] operationArray = {2,1,1,2,2,2,1,1,1,1,2};
        int[] expected = {6};

        int[] result = solution(amountOfCounters, operationArray);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForTwoCountersManyOperations() {
        int amountOfCounters = 2;
        int[] operationArray = {2,1,3,2,2,2,1,3,1,1,2};
        int[] expected = {6,5};

        int[] result = solution(amountOfCounters, operationArray);

        assertArrayEquals(expected, result);
    }
}