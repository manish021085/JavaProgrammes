package ImpJavaProgram.ImpJavaProgram.Practice;

public class DuplicateArray {
	public static void main(String args []) {
//		duplicateArray();
//		reverseArray();
//		factorialNumber(5);
		
	}
	
	public static void duplicateArray() {
		int arr[] = {2,3,2,3,4,5,6,4,7,8,9,6,4,11,55,45,67,43,44,33};
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if (arr[i] == arr[j])
				{
				System.out.println(arr[j]);
				}
			}
		}
	}
	
	public static void reverseArray() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		for(int org:arr) {
//			System.out.println(org);
//		}
		for (int i = arr.length-1;i>=0; i-- ) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void factorialNumber(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("fact:-> " + fact);
	}

}
