package LinkList;
import java.util.Scanner; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList L = new linkedList(); 
		for(int i = 1; i < 10; i++) {
		Scanner index = new Scanner(System.in);
		Scanner data = new Scanner(System.in);
		System.out.println("Enter a index press enter. Then enter data to associate with index and press enter");
		System.out.println("The start of the Linkedlist begins with index 1");
		L.addNode(index.nextInt(), data.nextInt());
		}
		L.traverseNodes();
		Scanner delete = new Scanner(System.in);
		System.out.println("Enter number to delete from LinkedList: ");
		L.removeNode(delete.nextInt());
		L.traverseNodes();
		System.out.println("Enter number to delete from LinkedList: ");
		L.removeNode(delete.nextInt());
		L.traverseNodes();
	}
}
