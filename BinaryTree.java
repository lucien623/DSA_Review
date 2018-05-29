package com.lucien.algorithm;

public class BinaryTree {
	 public static void main(String[] args) {
		//构造一棵二叉树
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		
		nodeA.left = nodeB;
		nodeA.right = nodeC;
		
		nodeB.parent = nodeA;
		nodeB.left = nodeD;
		nodeB.right = nodeE;
		
		nodeD.parent = nodeB;
		
		nodeE.parent = nodeB;
		nodeE.left = nodeG;
		
		nodeG.parent = nodeE;
		
		nodeC.parent = nodeA;
		nodeC.right = nodeF;
		
		nodeF.parent = nodeC;
		
		inOrder(nodeA);
	}
	 
	/**
	 * 先序遍历 根节点-左节点-右节点
	 * @param node root node
	 */
	private static void preOrder(Node node) {
		if(node != null) {
			System.out.print(node.data + "-->");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	/**
	 * 中序遍历 左节点-根节点-右节点
	 * @param node root node
	 */
	private static void inOrder(Node node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.data + "-->");
			inOrder(node.right);
		}
	}
	
	/**
	 * 后续遍历 左节点-右节点-根节点
	 * @param node root node
	 */
	private static void postOrder(Node node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + "-->");
		}
	}
	
}
class Node<T> {
	public T data;
	public Node left;
	public Node right;
	public Node parent;
	
	public Node(T data) {
		this.data = data;
	}
}
