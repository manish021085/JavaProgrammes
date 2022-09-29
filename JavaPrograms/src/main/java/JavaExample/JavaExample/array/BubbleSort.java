package JavaExample.JavaExample.array;

public class BubbleSort {

	public static void main(String[] args) {
		
		// array elements
		int [] a = {36, 18, 45, 78, 77, 99, 91, 3, 13, 55};
		int temp;
		
		//loop for length of round
		for(int i =0; i<a.length; i++) {
			//loop for adjcement element
			for(int j =0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
			
		}
		for(int i = 0; i<a.length; i++) {
//			System.out.println("Sorted array :");
			System.out.print(a[i] + " ");
		}
		System.out.println( "\n"+"Length of array : " + a.length);
		
		

	}

}
