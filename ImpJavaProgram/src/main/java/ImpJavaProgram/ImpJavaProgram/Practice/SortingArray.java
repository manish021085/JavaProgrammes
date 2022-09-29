package ImpJavaProgram.ImpJavaProgram.Practice;

public class SortingArray {

	public static void main(String[] args) {
		sortingArray();

	}
	public static void sortingArray() {
		int []a = {1,3,4,7,6,2,9,5,8};
		int temp;
		for(int i =0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		for(int i=0; i<a.length-1; i++)
		System.out.println(a[i]+ " ");
	}

}
