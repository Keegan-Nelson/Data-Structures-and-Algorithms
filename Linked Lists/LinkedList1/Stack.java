package linkedList;

import linkedList.List.Node;

public class Stack {
	
List L = new List(); 

public class Node {
	private int data; //According to my application I could create a subclass node for different classes or create it once 
	Node next; 		  // In this case its good to create two different subclasses because in list it requires double and in stack it takes int 
}
private Node top; 
 
/// NEED TO WORK ON THIS PUSH FUNCION SO THAT WE CAN USE IT IN THE MAIN
 public void push(int x) {
	 Node newNode = new Node(); 
	 newNode.data = x; 
	 newNode.next = top; 
	 top = newNode;
 }
 
 
 public int pop() {
	 int temp;
	 if(top == null) {
		System.out.println("The stack is empty");
		return -1; // This doesn't always have to be -1 just needs to return a non-sense number so that it shows nothing happened
	 }
	 temp = top.data; 
	 top = top.next; 
	 return temp; // Will want to return the temporary value that was popped from the stack 
 }
 
 
 public boolean isEmpty() { 
	 
	 return L.isEmpty() == true; 
 }
 public void displayStack() {
	 L.DisplayList();
 }
}
