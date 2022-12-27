package queue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
//import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue q = new Queue(); 
		
		//Queue<Integer> q = new LinkedList<>();
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter 10 Numbers to enter into the queue "); 
		int temp; 
		int i; 
		// This will itterate through the empty spots in the queue so that 
		// a total of 10 elements can be added to the queue 
		for( i = 0; i < 10; i++) {
			temp = scan.nextInt();
			q.enQueue(temp);
		}
		  ////////// ERRRRRRRROROOROROROORO printing address and not actual numbers can fix this using 
		//System.out.println(q.display());																	// Queue<Integer> q = new LinkedList<>(); but then have to change neQueue to add 
		q.display();
		// Need to write a display function to print the elements 
	  }

}
