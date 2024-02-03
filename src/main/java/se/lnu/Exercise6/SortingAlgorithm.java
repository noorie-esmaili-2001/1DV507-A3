package ne222hz_assign3.Exercise6;

import java.util.Comparator;

public class SortingAlgorithm {
	public int[] insertionSort(int[] in) { // https://java2blog.com/implement-insertion-sort-in-java/
		for (int i = 1; i < in.length; i++) {
			int valueToSort = in[i];
			int j;
			for (j = i; j > 0 && in[j - 1] > valueToSort; j--) {
				in[j] = in[j - 1];
			}
			in[j] = valueToSort;
		}
		printArray(in);
		return in;
	}

	public int[] mergeSort(int[] in) {
		mergeSort(in, 0, in.length - 1);
		printArray(in);
		return in;
	}

	public static void mergeSort(int[] input, int start, int end) { // https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html
		int mid = (start + end) / 2;
		if (start < end) {
			mergeSort(input, start, mid);
			mergeSort(input, mid + 1, end);
		}
		int i = 0;
		int first = start;
		int last = mid + 1;
		int[] tmp = new int[end - start + 1];
		while (first <= mid && last <= end) {
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
		}
		while (first <= mid) {
			tmp[i++] = input[first++];
		}
		while (last <= end) {
			tmp[i++] = input[last++];
		}
		i = 0;
		while (start <= end) {
			input[start++] = tmp[i++];
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void printArraySt(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public String[] insertionSort(String[] in, Comparator<String> c) {

		for (int i = 0; i != in.length; i = i + 1) {
			String itemToInsert = in[i];
			int j = i;
			while (j != 0 && (c.compare(in[j - 1], itemToInsert) > 0)) {
				in[j] = in[j - 1];
				j = j - 1;
			}
			in[j] = itemToInsert;
		}

		return in;

	}

	public String[] mergeSort(String[] in, Comparator<String> c) {
		return in;
		// VG Exercise
	}

}
