package ne222hz_assign3.Exercise6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class SortingAlgorithmTest {

	@Test
	void test() {
		SortingAlgorithm tst = new SortingAlgorithm();
		int arr[] = { 12, 9, 10, 1, 15, 19, 20, 0, 2, 40, 100, 99 };
		String output = Arrays.toString(tst.insertionSort(arr));
		String output1 = Arrays.toString(tst.mergeSort(arr));
		assertEquals("[0, 1, 2, 9, 10, 12, 15, 19, 20, 40, 99, 100]" , output);
		assertEquals("[0, 1, 2, 9, 10, 12, 15, 19, 20, 40, 99, 100]", output1);
		String []arr1 = {"a" , "c" , "b"};
	
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		String output2 = Arrays.toString(tst.insertionSort(arr1, c));
		assertEquals("[a, b, c]", output2);

	}

}
