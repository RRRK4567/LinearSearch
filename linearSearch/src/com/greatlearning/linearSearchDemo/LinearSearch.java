package com.greatlearning.linearSearchDemo;

public class LinearSearch {

	public static int linearSearch(int[] array, int keyElement, int size) {
		for (int i = 0; i < size; size++) {
			if (array[i] == keyElement) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int array[] = {101, 200, 94, 52, 65};
		int size = array.length;
		int keyElement = 94;
		int position = linearSearch(array, keyElement, size);
		if (position==-1) {
			System.out.println("Element is not present in the given array");
		} else {
			System.out.println("Element found at array index" +position);
		}
	}

}
