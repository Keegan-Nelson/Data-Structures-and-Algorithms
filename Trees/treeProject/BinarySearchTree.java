package treeProject;

public class BinarySearchTree {
	private Node root;
	
	private class Node { 
		Object theData; 
		Node left; 
		Node right;
	}
	/*
	public void containsBS(Object obj) {
		Node currentNode = root; 
		if(currentNode == null) {
			System.out.println("The Node that was input cannot be found");
		}
		recrusiveContainsBS(obj, currentNode);
	}
	public void recrusiveContainsBS(Object obj, Node currentNode) { 
		if(((Comparable)obj).compareTo(currentNode.theData) = 0) {
			
		}
	}
	*/
	public boolean recursiveContainBS(Object obj, Node node) {
		if(node == null) return false; 
		if(((Comparable)obj).compareTo(node.theData) == 0) return true; 
		if(((Comparable)obj).compareTo(node.theData) < 0) recursiveContainBS(obj, node.left);
		else recursiveContainBS(obj, node.right); 
		return false;  // Would need to add this false or code would be mad 
	}
	public void addNodeBS(Object obj) {
		if(root == null) {
			root = new Node(); 
			root.theData = obj; 
			return;
		}
		recursiveAddBS(obj, root); 
	}
	private void recursiveAddBS(Object obj, Node node) {
		if(((Comparable)obj).compareTo(node.theData) < 0) {    // Will return -1 if the object being added is smaller than the node's data
			if(node.left == null) {
				node.left = new Node(); 
				node.left.theData = obj; 
			}
			else recursiveAddBS(obj, node.left);
		}
		else if(((Comparable)obj).compareTo(node.theData) > 0) {  // Will return 1 if the object being added is bigger than the node's data
			if(node.right == null) {
				node.right = new Node(); 
				node.right.theData = obj; 
			}
			else recursiveAddBS(obj, node.right); 
		}
		else System.out.println("Cannot add duplicates to the tree");
	}
}
