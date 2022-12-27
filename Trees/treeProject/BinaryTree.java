package treeProject;

import java.util.Random; 

public class BinaryTree {
	
	private Node root; 
	Random rangen = new Random(); 
	
	private class Node { 
		Object theData; 
		Node left; 
		Node right;
	}
	
	// Professor Code 
	public void addNode(Object obj){
		// If the tree is empty the create first node
		if(root == null){
			root = new Node();
			root.theData = obj;
			return;
		}
	// Other wise add the node to the (sub)tree 
	//  that has the root node as its first node
		recursiveAdd(obj, root);
	}
	private void recursiveAdd(Object obj, Node node) throws NullPointerException{
		// If you get handed a null reference complain
		if(node == null) throw new NullPointerException();
		// If the left branch of the node is available put the new node there
		if(node.left == null){
			node.left = new Node();
			node.left.theData = obj;
		}
		// If the left isn't available try the right
		else if(node.right == null){
			node.right = new Node();
			node.right.theData = obj;
		}
		// If neither the left or right are available then pick either the left branch 
		// or the right branch at random and add the node to that subtree
		else{
			if( rangen.nextBoolean()){
				recursiveAdd(obj, node.left);
			}
			else{
				recursiveAdd(obj, node.right);
			}
		}
	}
	
	/*
	//Adding function // My variation 
	public void addNode(Object Obj) {
		
		root = new node(); 
		root.theData = Obj; 
		return; 
	}
	public void addRecursion(Object Obj, node node) throws NullPointerException {
		if(root == null) throw new NullPointerException();
		if (node.left == null) {
				node.left = new node(); 
				node.left.theData = Obj; 
		}
		else if(node.right == null) {
			node.right = new node();
			node.right.theData = Obj;
		}
		else {
			Random rangen = new Random(); 
			if(rangen.nextBoolean() == true) addRecursion(Obj, node.left);
			else if(rangen.nextBoolean() == false) addRecursion(Obj, node.right); 
		}
	}
	*/
	/*
	//Traversing Functions
	private void preOrder(node node) {
		if(node != null) {
			System.out.print(node.theData);
			preOrder(node.left);
			preOrder(node.right);
		}
		return;
	}
	/*
	private void inOrder(node node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.theData);
			inOrder(node.right);
		}
		return;
	}
	private void postOrder(node node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.theData);
		}
		return; 
	}
	*/
	/*
	public void preorder() { 
		if(root == null) return;
		System.out.println("I am here");
		preorderRecursion(root); 
	}
	*/
	
	public String preorder() {
		String temporary  = "->";
		
		if(root == null) return temporary; 
		preorderRecursion(root);
		System.out.println(temporary);
		return temporary;
	}
	
	private void preorderRecursion(Node node) {
			
		if(node == null) return;
		System.out.println(node.theData);
		preorderRecursion(node.left);
		preorderRecursion(node.right);
	}
	
	public String inorder() {
		String temporary = "->";
		
		if(root == null) return temporary;
		inorderRecursion(root);   
		return temporary; 
	}
	private void inorderRecursion(Node node) {
		
		if(node == null) return; 
		System.out.println(node.left.theData);  
		inorderRecursion(node);
		inorderRecursion(node.right);
	}
	public String postorder() {
		String temporary = "->";
		
		if(root == null) return temporary;
		postorderRecursion(root);    
		return temporary; 
	}
	private void postorderRecursion(Node node) {
		
		if(node == null) return; 
		System.out.println(node.left.theData);  
		postorderRecursion(node.right);
		postorderRecursion(node);
	}
	
}
