package linkedList;

public class List {

	
	//SUBCLASS NODE
	public class Node {
		private double data; 
		Node next; 
	}
	
	//VARIABLES
	private int index; 
	private Node head; 
	
	//METHODS/FUNCTIONS
	public void list() { 
		head = null; 
	}
	boolean isEmpty() { 
		return head == null; 
	}
	
	public int findNode(double x) {
		Node currentNode = head; 
		int currentIndex = 1; 
		while(currentNode != null && currentNode.data != x) {
			currentNode = currentNode.next; 
			currentIndex++;
		}
		if(currentNode != null) {
			return currentIndex; 
		}
		return 0; 
	}
	public void DisplayList() {
		int number = 0; 
		Node currentNode = head; 
		while(currentNode != null) {
			System.out.println(currentNode.data); 
			currentNode = currentNode.next; 
			number++;
			//System.out.println("Current index="+number);
		}
		System.out.println("The total number of nodes in the LinkedList: " + number);
		
	}
	
	int DeleteNode(double x) {
		Node previousNode = null; 
		Node currentNode = head; 
		int currentIndex = 1;
		while(currentNode != null && currentNode.data != x) {
			previousNode = currentNode; 
			currentNode = currentNode.next; 
			currentIndex++; 
		}
		if(currentNode != null) { 
			if(previousNode != null) {
				previousNode.next = currentNode.next; 
			}
			else { 
				head = currentNode.next; 
			}
			return currentIndex; 
		}
		return 0; 
	}
	
	
	// InsertNode Function with body
	public Node insertNode(int index, double x) { 
		if(index < 0) {
			return null;
		}
		int currentIndex = 1; 
		Node currentNode = head; 
		while(currentNode != null && index > currentIndex) { 
			currentNode = currentNode.next; 
			currentIndex++; 
			System.out.println("Current index="+currentIndex);
		}
		if(index > 0  && currentNode == null) {
			return null; 
		}
		Node newNode = new Node(); 
		newNode.data = x; 
		//If Statement about adding the newNode to the beginning of the linked list. After the first ELement
		//This will point to the 
		if(index == 0) {
			newNode.next = head;        
			head = newNode;
		}
		//Else Statement about adding the newNode to the currentNode of the linked list. 
		//This will point to the next nodes spot and then the 
		else {
			newNode.next = currentNode.next; 
			currentNode.next = newNode; 
		}
		return newNode;
	}
}
