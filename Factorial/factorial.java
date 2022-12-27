package Basics;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		long fact = 1;
		int i; 
		
		System.out.println("Enter a number to find the factorial: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		
		for(i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of " + num +" is " + fact);
	
}
	
}
