package Stack;

public class Stack {
	
	private int arr[];
	private int top; 
	private int capacity; 
	
	Stack(int size) {
		  capacity = size; 
		  arr = new int[size];
		  top = -1; 
	}
	// Need a Push Function 
	public void push(int x) {
		
				if(isFull()) {
					System.out.println("The Stack is Full");
					System.exit(1);
				}
				System.out.println("The variable " + x + " has been placed in the stack");
				arr[++top] = x; 
			
	}
	
	// Need a Pop Function 
	public int Pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			System.exit(1);
		}
		int x = arr[top--];
		return x; 
	}

	// Need a isFull Function 
	public boolean isFull() {
		return top == capacity -1;  // This will find if the top value is at the largest capacity and cannot get any bigger
	}
	// Need a isEmpty Function 
	public boolean isEmpty() {
		return top == -1; 
		
	}

}
