package EducativeIo.Courses.GrokkingTheCodingInterview.Ch12_ModifiedBinarySearch.P4_NumberRange.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            String[] args = new String[0];
            assertAll(() -> Solution.main(args));
        });
    }

    @Test
    public void TrivialCase1() {
        int[] arr = new int[] {4, 6, 6, 6, 9};
        int key = 6;
        assertTimeout(Duration.ofMillis(1000), () -> {
            int[] expected = new int[] {1, 3};
            int[] actual = Solution.findRange(arr, key);
            assertArrayEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        int[] arr = new int[] {1, 3, 8, 10, 15};
        int key = 10;
        assertTimeout(Duration.ofMillis(1000), () -> {
            int[] expected = new int[] {3, 3};
            int[] actual = Solution.findRange(arr, key);
            assertArrayEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase3() {
        int[] arr = new int[] {1, 3, 8, 10, 15};
        int key = 12;
        assertTimeout(Duration.ofMillis(1000), () -> {
            int[] expected = new int[] {-1, -1};
            int[] actual = Solution.findRange(arr, key);
            assertArrayEquals(expected, actual);
        });
    }
}
