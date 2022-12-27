package queue;

public class Queue {

	private int SIZE =10; 
	private int[] items = new int[SIZE]; 
	private int front, rear; 
	
	public Queue() { 
		front = -1; 
		rear = -1; 
	}
	public boolean isFull() { 
		if(front == 0 && rear == SIZE - 1) { 
			return true;
		}
		return false;
	}
	public boolean isEmpty() { 
		if(front == -1) { 
			return true; 
		}
		else { 
			return false; 
		}
	}
	public void enQueue(int element) { 
		if(isFull()) { 
			System.out.print("Queue is full"); 
			System.exit(1);
		}
		else { 
				if(front == -1 ) {
					front = 0; 
				}
				rear++;
				items[rear] = element; 
				System.out.println("Insert " + element);
			
			}
			
	}
	public int deQueue() {
		int element = 0; 
		if(isEmpty()) { //////////////
			System.out.println("Queue is empty");
			System.exit(1);
		}
		else {
			element = items[front];
			if(front >= rear) { 
				front = -1; 
				rear = -1; 
			}
				else { 
					front++; 
				}
		System.out.println(element + "Deleted");
		return(element);
		}
		System.out.println(element + "Deleted");
		return(element);
	}
	
		public void display() {
		    for (int i = 0; i < SIZE; i++) {
		        System.out.println(items[(front + i) % SIZE]);
		    }
		}
	         
	
}
