package com.lucien.algorithm;

/**
 * 简单选择排序
 * @author lucien
 *
 */
public class SimpleSelectionSort {
	
	public static void main(String[] args) {
		int[] array = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
		simpleSelectionSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private static void simpleSelectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
