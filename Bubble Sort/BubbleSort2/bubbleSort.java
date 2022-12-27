
public class bubbleSort {

	public void sortBubble(int arr[]) {
		int L = arr.length; 
		for(int i = 0; i < L-1; i++) 
			for(int index =0; index < L-i-1; index++) 
				if(arr[index] > arr[index+1]) {  
					int temp = arr[index]; 
					arr[index] = arr[index+1]; 
					arr[index+1] = temp; 
				}
		 
	}
	void dispArr(int arr[]) {
		int L = arr.length; 
		for(int index=0; index<L; index++)
			System.out.print(arr[index] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSort b = new bubbleSort();
		int[] arr = {3,15,14,7,12,20,3,5,19,2}; 
		
		//int L = arr.length;
		//for(int index=0; index<L; index++) {
			//System.out.println(arr);
			b.sortBubble(arr);
			b.dispArr(arr);
	//	}
	//}

}
}

