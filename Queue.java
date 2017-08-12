package com.lucien.algorithm;

import java.util.LinkedList;

public class Queue<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	private void push(T t) {
		list.addLast(t);
	}
	
	private void pop() {
		if(!list.isEmpty()) {
			list.removeFirst();
		}
	}
	
	private T getHead() {
		return list.getFirst();
	}
	
	private boolean isEmpty() {
		return list.isEmpty();
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
