package treeProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree BT = new BinaryTree(); 
		BinarySearchTree BST = new BinarySearchTree(); 
		//BST.addNodeBS(1);
		//BST.addNodeBS(2);
		
		BT.addNode(1);
		BT.addNode(2);
		BT.addNode(3);
		BT.addNode(4);
		BT.addNode(5);
		BT.addNode(6);
		BT.addNode(7);
		BT.addNode(8);
		BT.addNode(9);
		//BT.preorder();
		 
		BT.inorder();
		//BT.postorder();
		
		
		
	}

}
