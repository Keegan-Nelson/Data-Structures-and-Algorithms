package dTob;
import java.util.*;
 

public class Stack {
	
	private static int i; 
	private static int counter; 
	static int arr[] = new int[1000];
	private int top; 
	private int capacity; 
	
	Stack(int size) {
		  capacity = size; 
		  arr = new int[size];
		  top = -1; 
	}
	// Need a Push Function 
	public static void push(int x) {
		arr[counter++] = x; 
	}
	
	// Need a Pop Function 
	public static void Pop() {
		for (i = counter -1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	// Need a isFull Function 
	public boolean isFull() {
		return top == capacity -1;  // This will find if the top value is at the largest capacity and cannot get any bigger
	}
	// Need a isEmpty Function 
	public boolean isEmpty() {
		return top == -1; 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter a decimal nubmer to convert to a binary number: ");
	int num = scan.nextInt();
	Stack stacky = new Stack(1000);
	
	while(num > 0) { 
		int x = num % 2; 
		stacky.push(x); 
		num /= 2;
		
	}
	
	System.out.print("Binary Equivalent: ");
	
	stacky.Pop(); 
	
	}
}
