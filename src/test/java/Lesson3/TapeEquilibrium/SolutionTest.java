package Lesson3.TapeEquilibrium;

import org.junit.jupiter.api.Test;

import static Lesson3.TapeEquilibrium.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForEquilibriumInCenter() {
        int expected = 3;
        int[] testArray = {1,2,3,4,5};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionForEquilibriumSmallestArrayOrdered() {
        int expected = 1;
        int[] testArray = {1,2};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionForEquilibriumSmallestArrayUnordered() {
        int expected = 1;
        int[] testArray = {2,1};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionForEquilibriumBalancedArray() {
        int expected = 0;
        int[] testArray = {1,2,3,4,5,5,4,3,2,1};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionForEquilibriumNegativeNumbers() {
        int expected = 990;
        int[] testArray = {1,-2,3,-4,5,5,-4,3,2,-1,1000};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionForEquilibriumBigNegativeNumbers() {
        int expected = 790;
        int[] testArray = {1,-200,3,-4,5,5,-4,3,2,-1,-1000};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

}