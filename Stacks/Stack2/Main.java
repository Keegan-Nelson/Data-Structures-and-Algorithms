package Stack;
import java.util.*; 
import java.util.Scanner;;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter 10 Numbers to enter into the stack");
		scan.nextInt();
		int temp; 
		int i;
		Stack testStack = new Stack(10);
		for( i = 0; i < 10; i++) {
			temp = scan.nextInt();
			testStack.push(temp);
		}
		
		System.out.println("Enter numbers to pop from stack");
		for( i = 0; i < 10; i--) {
			temp = scan.nextInt(); 
			//testStack.Pop(inputPop);
			System.out.println(testStack.Pop());
		}
		
		
	}
}
