package ImpJavaProgram.ImpJavaProgram.array;

public class Object_Array {
	public static void main(String[] args) {
		
		Object ob[] = {1,2,3,4,5,'c','d', "hello"};
		
		Object obj[][] = new Object[3][4];
		obj[0][0]="selenium";
		obj[0][1]=10.23;
		obj[0][2]=45;
		obj[0][3]=true;
		
		obj[1][0]="webdriver";
		obj[1][1]=11.23;
		obj[1][2]=55;
		obj[1][3]=false;
		
		obj[2][0]="python";
		obj[2][1]=17.23;
		obj[2][2]=44;
		obj[2][3]=true;
		
		System.out.println("The rows of this object is : " + obj.length);
		System.out.println("The columns of this object is : " + obj[0].length);
		
		//print all elements inside this object array
		
		int rows = obj.length;
		int cols = obj[0].length;
		
		for(int rowNum=0; rowNum<rows; rowNum++) {
			for(int colNum=0;colNum<cols;colNum++) {
				System.out.print(obj[rowNum][colNum]+ " ");
			}
			System.out.println();
		}
	}

}
