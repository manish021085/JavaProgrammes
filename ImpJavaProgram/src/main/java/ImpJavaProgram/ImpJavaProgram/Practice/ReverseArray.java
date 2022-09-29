package ImpJavaProgram.ImpJavaProgram.Practice;

public class ReverseArray {

	public static void main(String[] args) {
		reverseArray();

	}
	public static void reverseArray() {
		int []arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}

}
