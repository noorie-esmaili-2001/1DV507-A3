package se.lnu.Exercise6;

import java.util.Comparator;

public class SortingAlgorithm {
    public int[] insertionSort(int[] in) {
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

    public static void mergeSort(int[] input, int start, int end) {
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

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArraySt(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
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
        printArraySt(in);
        return in;

    }

}
