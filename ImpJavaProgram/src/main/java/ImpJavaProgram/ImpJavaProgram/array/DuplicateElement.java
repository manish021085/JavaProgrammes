package ImpJavaProgram.ImpJavaProgram.array;

public class DuplicateElement {
	
	public static void duplicateElement() {
		int arr[] = {1,3,5,3,6,8,3,9,5,2,1};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		duplicateElement();

	}

}
