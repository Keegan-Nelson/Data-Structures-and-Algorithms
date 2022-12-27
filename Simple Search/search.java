package Basics;
import java.util.Scanner;
import java.util.Random;
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//variables 
				Random rand = new Random(); 
				// int [] arr = new int[10]; 
				int index; 
				int num; 
				int flag = 0; 
				/*
				int[] arr = new int[10];
				for (int i=0; i < arr.length; i++) {
					arr[i] = rand.nextInt();
				}
				*/
						
				int[] arr ={7, 0, 1, 3, 4, 5, 2, 6, 11, 10}; 
				
				System.out.println("Enter a number to search for within the array: ");
				
				Scanner scan = new Scanner(System.in);
				num = scan.nextInt(); 
				
				for (index =0; index<10; index++) { // this will end up stopping at 9 if started at 0 
					//System.out.println(index); 
					if(num == arr[index]) { 
						System.out.println("I have found the number at location "+index);
						flag =1; 
					}
				
				}
				if(flag == 0) { 
					System.out.println("The number is not located in the array"); 
				}

		}
						// Would want to use a do while loop if you wanted the user to keep searching for diferent numbers thoughout the array. 
			 
		
		
		
}
	
