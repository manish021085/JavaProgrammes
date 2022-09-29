package ImpJavaProgram.ImpJavaProgram.Practice;

public class DuplicateArrayy {

	public static void main(String[] args) {
		duplicateArray();

	}
	public static void duplicateArray() {
		int []arr = {1,3,4,7,3,4,6,2,9,5,9, 2};
		for(int i=0; i<=arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j]+ " ");
				}
			}
		}
		
	}

}
