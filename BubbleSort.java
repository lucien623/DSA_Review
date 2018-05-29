package com.lucien.algorithm;

/**
 * 冒泡排序
 * @author lucien
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int list[] = {5, 1, 4, 2, 8};
		list = bubbleSort(list);
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
	}
	
	private static int[] bubbleSort(int[] list) {
		int length = list.length;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if(list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		
		return list;
	}
}
