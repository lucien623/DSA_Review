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
	
	/**
	 * add node
	 * @param data
	 */
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
	
	/**
	 * insert node
	 * @param index insert index
	 * @param data
	 */
	private void insert(int index, Object data) {
		current = head;
		if(index == 0) {
			head = new Node(data);
			head.next = current;
			return;
		}
		Node preNode = null;
		while(current != null) {
			if((int)current.data == index) {
				Node node = new Node(data);
				preNode.next = node;
				node.next = current;
				return;
			}
			preNode = current;
			current = current.next;
		}
	}
	
	/**
	 * delete node
	 * @param index delete index
	 */
	private void delete(int index) {
		current = head;
		int pos = 0;
		Node preNode = head;
		while(current != null) {
			if(pos == index) {
				if(pos == 0)
					head = current.next;
				//判断当前节点是否还有下一个节点，有则将前一个节点的next指向下一个节点，
				//无则将前一个节点的next指向设置为null
				else {
					if(current.next != null) {
						preNode.next = current.next;
					}
					else {
						preNode.next = null;
					}
				}
				return;
			}
			preNode = current;
			current = current.next;
			pos++;
		}
	}
	
	/**
	 * 查找位置为index的节点，若无则返回为null 
	 * @param index
	 * @return
	 */
	private Node find(int index) {
		current = head;
		int pos = 0;
		while(current != null) {
			if(index == pos) {
				return current;
			}
			current = current.next;
			pos++;
		}
		return null;
	}
	
	/**
	 * 获取链表的长度
	 * @return
	 */
	private int getLinkListLength() {
		current = head;
		int length = 0;
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	/**
	 * print all the node data in linklist
	 * @param node
	 */
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
	
	
	public Node reverseHead;
	/**
	 * 链表反转
	 */
	private void reverseLinkList() {
		current = head;
		while(current != null) {
			Node preHead = reverseHead;
			reverseHead = current;
			current = current.next;
			if(preHead != null) {
				reverseHead.next = preHead;
			}
			else {
				reverseHead.next = null;
			}
		}
	}
	
	/**
	 * 链表反转（递归方式）
	 */
	private Node reverseLinkListRec(Node head) {
		if(head == null || head.next == null)
			return head;
		Node newHead = reverseLinkListRec(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	/**
	 * 获取倒数第index节点
	 * @param index
	 * @return
	 */
	private Node getReciprocalNode(int index) {
		if(index == 0)
			return null;
		current = head;
		Node start = head;
		while(current != null) {
			index--;
			if(index == 0)
				break;
			current = current.next;
		}
		// 长度大于链表长度
		if(current == null) {
			return null;
		}
		while(current.next != null) {
			current = current.next;
			start = start.next;
		}
		return start;
	}
	
	public static void main(String[] args) {
		LinkList mLinkList = new LinkList();
		for(int i = 0; i < 10; i++) {
			mLinkList.add(i);
		}
		int index = 9;
		mLinkList.insert(index, "insert");
		mLinkList.delete(index);
		mLinkList.print(mLinkList.head);
		Node findNode  = mLinkList.find(index);
		if(findNode != null) {
			System.out.println(" data : " + findNode.data);
		}
		System.out.println(" length : " + mLinkList.getLinkListLength());
		mLinkList.reverseLinkList();
		mLinkList.print(mLinkList.reverseHead);
		System.out.println("");
		mLinkList.print(mLinkList.reverseLinkListRec(mLinkList.reverseHead));
		System.out.println("");
		Node reciprocalNode = mLinkList.getReciprocalNode(index);
		if(reciprocalNode != null) {
			System.out.println("ReciprocalNode : " + reciprocalNode.data);
		}
	}
}
