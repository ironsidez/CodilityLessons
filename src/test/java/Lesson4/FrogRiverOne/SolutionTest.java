package Lesson4.FrogRiverOne;

import org.junit.jupiter.api.Test;

import static Lesson4.FrogRiverOne.Solution.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solutionForUncrossableRiver() {
        int expected = -1;
        int riverWidth = 5;
        int[] leafArray = {1,2,3,4,1,2,3,4};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForSmallestRiver() {
        int expected = 0;
        int riverWidth = 1;
        int[] leafArray = {1,1,1,1,1,1,1,1};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForRiverWidthOfTwo() {
        int expected = 1;
        int riverWidth = 2;
        int[] leafArray = {1,2,1,2};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForRiverWidthOfFiveUnordered() {
        int expected = 4;
        int riverWidth = 5;
        int[] leafArray = {3,2,1,4,5};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForRiverWidthOfFiveUnorderedExtraLeafs() {
        int expected = 4;
        int riverWidth = 5;
        int[] leafArray = {3,2,1,4,5,3,2,3,4,5,1,2,3,4,2,1,3,4,1,2,3};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForRiverWidthOfFiveUnorderedExtraLeafsBeforeSolution() {
        int expected = 12;
        int riverWidth = 5;
        int[] leafArray = {3,1,1,1,3,4,5,3,1,1,1,1,2,1,4,5,3,2,3,4,5,1,2,3,4,2,1,3,4,1,2,3};

        int result = solution(riverWidth, leafArray);

        assertEquals(expected, result);
    }

}