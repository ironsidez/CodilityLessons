package Lesson4.MissingInteger;

import org.junit.jupiter.api.Test;

import static Lesson4.MissingInteger.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForSmallestArrayWithZero() {
        int[] testArray = {0};
        int expected = 1;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForSmallestArrayWithNegative() {
        int[] testArray = {-10};
        int expected = 1;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForSmallestArrayWithOne() {
        int[] testArray = {1};
        int expected = 2;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForOrderedArrayWithAnswerFive() {
        int[] testArray = {1,2,3,4};
        int expected = 5;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForOrderedArrayWithAnswerFour() {
        int[] testArray = {1,2,3,5};
        int expected = 4;

        int result = solution(testArray);

        assertEquals(expected, result);
    }

}