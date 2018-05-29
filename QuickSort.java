package com.lucien.algorithm;

import java.util.Scanner;

/**
 * 快速排序
 * @author lucien
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {7, 7, 7, 7, 7, 7, 7, 7, 7};
		sort(array, 0, array.length - 1);
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private static void sort(int[] array, int low, int high) {
		int l = low;
		int h = high;
		if(l >= h)
			return;
		int pivot = array[high];
		while(l < h) {
			while(array[l] > pivot && l < h) {
				int temp = array[h - 1];
				array[h] = array[l];
				array[l] = temp;
				h--;
			}
			while(array[l] <= pivot && l < h) {
				l++;
			}
		}
		array[l] = pivot;
		sort(array, low, l - 1);
		sort(array, l + 1, high);
	}
}
