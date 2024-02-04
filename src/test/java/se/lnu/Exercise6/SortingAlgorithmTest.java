package se.lnu.Exercise6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmTest {

	@Test
	void test() {
		SortingAlgorithm tst = new SortingAlgorithm();
		int[] arr = { 12, 9, 10, 1, 15, 19, 20, 0, 2, 40, 100, 99 };
		String output = Arrays.toString(tst.insertionSort(arr));
		String output1 = Arrays.toString(tst.mergeSort(arr));
		assertEquals("[0, 1, 2, 9, 10, 12, 15, 19, 20, 40, 99, 100]" , output);
		assertEquals("[0, 1, 2, 9, 10, 12, 15, 19, 20, 40, 99, 100]", output1);
		String[] arr1 = {"a" , "c" , "b"};

		Comparator<String> c = Comparator.naturalOrder();
		String output2 = Arrays.toString(tst.insertionSort(arr1, c));
		assertEquals("[a, b, c]", output2);
	}
}
