package testExoAlgo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import exoAlgo.exoAlgo;

class exoAlgoTest {

	@Test
	void testSplitRevConcatArray() {
		int[] A = {0,1,2,3,4,5,6,8,9};
		int i = 2;
		assertTrue(Arrays.equals(new int[] {0, 1, 2, 3, 4, 5, 6, 9, 8}, exoAlgo.splitRevConcatArray(A,i)));
		
	}

	@Test
	void testReverseArray() {
		int[] A = {0,1,2};

		assertTrue(Arrays.equals(new int[] {2,1,0}, exoAlgo.reverseArray(A)));
	}

	@Test
	void testConcatenateArray() {
		int[] A = {0,1,2};
		int[] B = {3,4};

		assertTrue(Arrays.equals(new int[] {0, 1, 2, 3, 4},exoAlgo.concatenateArray(A,B)));
	}

}
