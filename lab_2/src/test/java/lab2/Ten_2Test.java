package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ten_2Test {

    @Test
    public void testGenerateBArray() {
        int[] inputArray = {3, 1, 3, 2, 1, 3};
        int[] expectedBArray = {3, 2, 3, 1, 2, 3};

        int[] resultBArray = Ten_2.generateBArray(inputArray);

        assertArrayEquals(expectedBArray, resultBArray, "The generated array b does not match the expected result.");
    }

    @Test
    public void testGenerateBArrayWithUniqueElements() {
        int[] inputArray = {1, 2, 3};
        int[] expectedBArray = {1, 1, 1};

        int[] resultBArray = Ten_2.generateBArray(inputArray);

        assertArrayEquals(expectedBArray, resultBArray, "The generated array b does not match the expected result for unique elements.");
    }

    @Test
    public void testGenerateBArrayWithAllSameElements() {
        int[] inputArray = {4, 4, 4, 4};
        int[] expectedBArray = {4, 4, 4, 4};

        int[] resultBArray = Ten_2.generateBArray(inputArray);

        assertArrayEquals(expectedBArray, resultBArray, "The generated array b does not match the expected result for identical elements.");
    }

    @Test
    public void testGenerateBArrayWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedBArray = {};

        int[] resultBArray = Ten_2.generateBArray(inputArray);

        assertArrayEquals(expectedBArray, resultBArray, "The generated array b does not match the expected result for an empty array.");
    }
}
