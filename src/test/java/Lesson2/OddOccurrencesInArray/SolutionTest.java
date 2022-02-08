package Lesson2.OddOccurrencesInArray;

import org.junit.jupiter.api.Test;

import static Lesson2.OddOccurrencesInArray.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForOrderedArrayOddInMiddle() {
        int[] A = {1,1,2,2,3,4,4};
        int result = solution(A);
        int expected = 3;

        assertEquals(expected,result);
    }

    @Test
    void solutionForOrderedArrayOddInFront() {
        int[] A = {1,2,2,3,3,4,4};
        int result = solution(A);
        int expected = 1;

        assertEquals(expected,result);
    }

    @Test
    void solutionForOrderedArrayOddInBack() {
        int[] A = {1,1,2,2,3,3,4,4,5};
        int result = solution(A);
        int expected = 5;

        assertEquals(expected,result);
    }

    @Test
    void solutionForUnorderedArrayOddInBack() {
        int[] A = {1,5,1,2,2,3,3,4,4};
        int result = solution(A);
        int expected = 5;

        assertEquals(expected,result);
    }

    @Test
    void solutionForArraySizeOne() {
        int[] A = {4};
        int result = solution(A);
        int expected = 4;

        assertEquals(expected,result);
    }

    @Test
    void solutionForOrderedArrayOddInBackMoreThanOne() {
        int[] A = {1,1,2,2,3,3,4,4,5,5,5};
        int result = solution(A);
        int expected = 5;

        assertEquals(expected,result);
    }

    @Test
    void solutionForUnorderedArrayOddInBackMoreThanOne() {
        int[] A = {1,1,2,2,7,3,3,4,4,7,7};
        int result = solution(A);
        int expected = 7;

        assertEquals(expected,result);
    }

    @Test
    void solutionForUnorderedArrayLotsOfSame() {
        int[] A = {2,2,4,4,2,4,2,4,4,4,4,4,2,2,4,4,2,4,2};
        int result = solution(A);
        int expected = 4;

        assertEquals(expected,result);
    }
}