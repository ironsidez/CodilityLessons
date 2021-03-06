package Lesson3.FrogJmp;

import org.junit.jupiter.api.Test;

import static Lesson3.FrogJmp.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solutionForThreeJumps(){
        int start = 10;
        int end = 85;
        int jumpLength = 30;
        int expected = 3;

        int result = solution(start, end, jumpLength);
        assertEquals(expected, result);
    }

    @Test
    void solutionForAllOnes(){
        int start = 1;
        int end = 1;
        int jumpLength = 1;
        int expected = 0;

        int result = solution(start, end, jumpLength);
        assertEquals(expected, result);
    }

    @Test
    void solutionForStartPassedEnd(){
        int start = 5;
        int end = 1;
        int jumpLength = 1;
        int expected = 0;

        int result = solution(start, end, jumpLength);
        assertEquals(expected, result);
    }

    @Test
    void solutionForLotsOfJumps(){
        int start = 1;
        int end = 1000000;
        int jumpLength = 1;
        int expected = 999999;

        int result = solution(start, end, jumpLength);
        assertEquals(expected, result);
    }

    @Test
    void solutionForBigJump(){
        int start = 1;
        int end = 1000000;
        int jumpLength = 1000001;
        int expected = 1;

        int result = solution(start, end, jumpLength);
        assertEquals(expected, result);
    }
}