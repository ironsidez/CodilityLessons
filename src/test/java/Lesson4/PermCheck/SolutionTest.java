package Lesson4.PermCheck;

import org.junit.jupiter.api.Test;

import static Lesson4.PermCheck.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForNotAPermutation() {
        int[] testArray = {1,2,3,5};
        int expected = 0;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForAPermutation() {
        int[] testArray = {1,2,3,4};
        int expected = 1;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForAPermutationUnordered() {
        int[] testArray = {4,2,3,1};
        int expected = 1;

        int result = solution(testArray);

        assertEquals(expected, result);
    }
}