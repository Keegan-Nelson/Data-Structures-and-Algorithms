package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		List newList = new List(); 
		newList.insertNode(0, 2.0);
		newList.insertNode(1, 12.0);
		newList.DeleteNode(12.0);
		newList.DisplayList();
		//newList.findNode(2.0);
	*/	
		Stack newStack = new Stack(); 
		
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.pop();
		newStack.displayStack();
	}

}
