package Tree;

public class BinarySearchTree {
	
	Node root = new Node();
	
	public class Node {
			Object theData;
			Node left;
			Node right;
	}

	public void addNode(Object obj){
		Node root = new Node();
		if(root == null){
			root.theData = obj;
			return;
		}
		recursiveAdd(obj, root);
	}
	
	private void recursiveAdd(Object obj, Node node) throws NullPointerException{
		if(node == null)throw new NullPointerException();

		// If the object we're adding is less than the current node
		// go left
		if(((Comparable)obj).compareTo(node.theData)<0){
			if(node.left == null){
				node.left = new Node();
				node.left.theData = obj;
			}
			else {
				recursiveAdd(obj,node.left);
			}
		}
		// If the object we're adding is greater than or equal to the 
		// current node go right
		else {
			if(node.right == null){
				node.right = new Node();
				node.right.theData = obj;
			}
			else {
				recursiveAdd(obj,node.right);
			}
		}
	}
	
	public boolean removeNode(Object obj) {

		Node currentNode = root;
		Node parent = null;
		
		while( currentNode != null && ((Comparable)obj).compareTo(currentNode.theData) != 0){
		if(((Comparable)obj).compareTo(currentNode.theData) < 0) currentNode = currentNode.left; 
		else 
			currentNode = currentNode.right; 
	        parent = currentNode;
		}
		if(currentNode == null) return false; 
		//if(parent == null)removeRoot();

		if(currentNode.right == null){
			if(parent.left == currentNode) parent.left = currentNode.left;
			else parent.right = currentNode.left;
		}
		else if(currentNode.left == null) {
			if(parent.right == currentNode) parent.right = currentNode.right; 
			else parent.left = currentNode.right;
		}
		else {
			Node substitute = currentNode.left; 
			Node parentSubstitute = currentNode; 
			while(substitute.right != null) {
				parentSubstitute = substitute; 
				substitute = substitute.right; 
			}
			
			
		}
		
		return true;
	}
}
