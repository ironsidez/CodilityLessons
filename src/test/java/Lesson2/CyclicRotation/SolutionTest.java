package Lesson2.CyclicRotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForRotateArrayByOne(){
        int[] A = {3,8,7,6,5};
        int K = 1;
        int[] expected = {5,3,8,7,6};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForRotateArrayByTwo(){
        int[] A = {3,8,7,6,5};
        int K = 2;
        int[] expected = {6,5,3,8,7};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForRotateArrayByThree(){
        int[] A = {3,8,7,6,5};
        int K = 3;
        int[] expected = {7,6,5,3,8};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForRotateArrayByEight(){
        int[] A = {3,8,7,6,5};
        int K = 8;
        int[] expected = {7,6,5,3,8};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForRotateEmptyArray(){
        int[] A = new int[0];
        int K = 10;
        int[] expected = {};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionForRotateArrayByZero(){
        int[] A = {3,8,7,6,5};
        int K = 0;
        int[] expected = {3,8,7,6,5};

        int[] result = Solution.solution(A, K);

        assertArrayEquals(expected, result);
    }

    @Test
    void determineRotationAmountForDistanceEqualToArrayLength(){
        int[] A = {3,8,7,6,5};
        int K = 5;
        int expected = 0;

        int result = Solution.determineRotationAmount(A, K);

        assertEquals(expected, result);
    }

    @Test
    void determineRotationAmountForLessThanArrayLength(){
        int[] A = {3,8,7,6,5};
        int K = 3;
        int expected = 3;

        int result = Solution.determineRotationAmount(A, K);

        assertEquals(expected, result);
    }

    @Test
    void determineRotationAmountForMoreThanArrayLength(){
        int[] A = {3,8,7,6,5};
        int K = 7;
        int expected = 2;

        int result = Solution.determineRotationAmount(A, K);

        assertEquals(expected, result);
    }

}