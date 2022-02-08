package Lesson3.PermMissingElem;

import org.junit.jupiter.api.Test;


import static Lesson3.PermMissingElem.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForZeroLengthArray(){
        int[] testArray = new int[0];
        int expected = 1;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForOneLengthArrayWithOne(){
        int[] testArray = {1};
        int expected = 2;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForOneLengthArrayWithTwo(){
        int[] testArray = {2};
        int expected = 1;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForFiveLengthArray(){
        int[] testArray = {1,2,3,4,5};
        int expected = 6;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForFiveLengthArrayReverse(){
        int[] testArray = {5,4,3,2,1};
        int expected = 6;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionForFiveLengthArrayThreeMissing(){
        int[] testArray = {5,4,6,2,1};
        int expected = 3;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

}