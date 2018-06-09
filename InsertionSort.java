package com.lucien.algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
		insertionSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private static void insertionSort(int[] array) {
		for(int i = 0;  i < array.length - 1; i++) {
			for(int j = i + 1; j > 0; j--) {
				if(array[j - 1] <= array[j])
					break;
				int temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
			}
		}
	}
}
