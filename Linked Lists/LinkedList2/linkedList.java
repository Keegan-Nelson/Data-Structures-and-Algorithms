package LinkList;

public class linkedList {
	
	private Node head;
	
	public class Node {
		int theData;		
		Node next;		
	}

	public Node addNode(int index, int x) {
		if (index < 0) return null;	
		
		int currentIndex =	1;
		Node currentNode =	head;
		while (currentNode != null && index > currentIndex) {
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (index > 0 && currentNode == null) return null;
		
		Node newNode = new Node();
		newNode.theData	= x;	
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			newNode.next = currentNode.next;
			currentNode.next =	newNode;
		}
		return newNode;

	}
	public int removeNode(int x) {
		
		
		Node prevNode = null;
		Node currentNode = head;
		int currIndex = 1;
		while (currentNode != null && currentNode.theData != x) {
			prevNode = currentNode;
			currentNode	= currentNode.next;
			currIndex++;
		}
		if (currentNode != null) {
			if (prevNode != null) {
				prevNode.next = currentNode.next;
						}
			else {
				head = currentNode.next;
			}               
			return currIndex;
		}
		return 0;
	}
	public int searchNode(int x) {
		Node currentNode =	head;
		int currentIndex =	1;
		while (currentNode !=null && currentNode.theData != x) {
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) return currentIndex;
		return 0;
	}
	
	public void traverseNodes() {
		Node 
		Node temp = head; 
		if(head == null) System.out.println("The Linked List is Empty");
		
		while(temp != null) {
			System.out.println("Node = " + temp.theData);
			temp = temp.next;
		}
	}
}

	
