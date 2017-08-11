package com.lucien.algorithm;

public class LinkList {
	
	class Node<T> {
		public T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public Node head;
	public Node current;
	
	private void add(Object data) {
		//如果头节点为空，则创建一个新节点，并将其设置为头节点以及当前节点。
		if(head == null) {
			head = new Node(data);
			current = head;
		}
		else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	private void insert(int index, Object data) {
		current = head;
		if(index == 0) {
			head = new Node(data);
			head.next = current;
			return;
		}
		while(current != null) {
			if((int)current.data == index) {
				Node node = new Node(data);
				if(current.next != null) {
					node.next = current.next;
				}
				current.next = node;
				return;
			}
			current = current.next;
		}
	}
	
	private void print(Node node) {
		if(node == null) {
			return;
		}
		current = node;
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkList mLinkList = new LinkList();
		for(int i = 0; i < 10; i++) {
			mLinkList.add(i);
		}
		mLinkList.insert(9, "first");
		mLinkList.print(mLinkList.head);
	}
}
