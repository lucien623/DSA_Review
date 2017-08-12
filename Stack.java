package com.lucien.algorithm;

import java.util.LinkedList;

public class Stack<T> {
	private T data;
	private LinkedList<T> list = new LinkedList<T>();
	
	public void push(T t) {
		list.addFirst(t);
	}
	
	public void pop() {
		if(!list.isEmpty()) {
			list.removeFirst();
		}
	}
	
	public T getPop() {
		return list.getFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
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
