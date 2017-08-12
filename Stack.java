package com.lucien.algorithm;

import java.util.LinkedList;

public class Stack<T> {
	private T data;
	private LinkedList<T> mList = new LinkedList<T>();
	
	public void push(T t) {
		mList.addFirst(t);
	}
	
	public void pop() {
		if(!mList.isEmpty()) {
			mList.removeFirst();
		}
	}
	
	public T getPop() {
		return mList.getFirst();
	}
	
	public boolean isEmpty() {
		return mList.isEmpty();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		for(int i = 0 ; i < 5; i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.getPop() + "->");
			stack.pop();
		}
	}
	
}
