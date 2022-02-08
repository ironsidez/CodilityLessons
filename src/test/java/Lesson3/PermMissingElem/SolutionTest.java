package Lesson3.PermMissingElem;

import org.junit.jupiter.api.Test;


import static Lesson3.PermMissingElem.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionTestZeroLengthArray(){
        int testArray[] = new int[0];
        int expected = 1;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionTestOneLengthArrayWithOne(){
        int testArray[] = {1};
        int expected = 2;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionTestOneLengthArrayWithTwo(){
        int testArray[] = {2};
        int expected = 1;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionTestFiveLengthArray(){
        int testArray[] = {1,2,3,4,5};
        int expected = 6;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionTestFiveLengthArrayReverse(){
        int testArray[] = {5,4,3,2,1};
        int expected = 6;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

    @Test
    void solutionTestFiveLengthArrayThreeMissing(){
        int testArray[] = {5,4,6,2,1};
        int expected = 3;
        int result = solution(testArray);

        assertEquals(expected, result);
    }

}