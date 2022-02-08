package Lesson1.BinaryGap;

import org.junit.jupiter.api.Test;

import static Lesson1.BinaryGap.Solution.solution;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertTenToBinaryString() {
        String expected = "1010";
        String result = Solution.convertToBinaryString(10);

        assertEquals(expected, result);
    }

    @Test
    void solutionForOne() {
        int expected = 0;
        int result = solution(1);

        assertEquals(expected, result);
    }

    @Test
    void solutionForTwo() {
        int expected = 0;
        int result = solution(2);

        assertEquals(expected, result);
    }

    @Test
    void solutionForFive() {
        int expected = 1;
        int result = solution(5);

        assertEquals(expected, result);
    }

    @Test
    //10000010001
    void solutionForOneThousandFortyOne() {
        int expected = 5;
        int result = solution(1041);

        assertEquals(expected, result);
    }

    @Test
    //1000100000010001
    void solutionForThirtyFourThousandEightHundredThirtyThree() {
        int expected = 6;
        int result = solution(34833);

        assertEquals(expected, result);
    }
}