package Lesson3.TapeEquilibrium;

import org.junit.jupiter.api.Test;

import static Lesson3.TapeEquilibrium.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionTest() {
        int expected = 3;
        int testArray[] = {1,2,3,4,5};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionTest2() {
        int expected = 1;
        int testArray[] = {1,2};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionTest3() {
        int expected = 1;
        int testArray[] = {2,1};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

    @Test
    void solutionTest4() {
        int expected = 0;
        int testArray[] = {1,2,3,4,5,5,4,3,2,1};

        int result = solution(testArray);
        assertEquals(expected, result);
    }

}