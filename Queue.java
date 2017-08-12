package com.lucien.algorithm;

import java.util.LinkedList;

public class Queue<T> {
	
	private LinkedList<T> mList = new LinkedList<T>();
	
	private void push(T t) {
		mList.addLast(t);
	}
	
	private void pop() {
		if(!mList.isEmpty()) {
			mList.removeFirst();
		}
	}
	
	private T getHead() {
		return mList.getFirst();
	}
	
	private boolean isEmpty() {
		return mList.isEmpty();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		for(int i = 0; i < 5; i++) {
			queue.push(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.getHead() + "->");
			queue.pop();
		}
	}
}
