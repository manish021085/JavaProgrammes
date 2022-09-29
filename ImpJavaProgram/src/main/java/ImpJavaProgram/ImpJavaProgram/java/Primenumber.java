package ImpJavaProgram.ImpJavaProgram.java;

public class Primenumber {
	//method 1
	public static void isPrimenumber1(int num) {
		int count = 0;
		for(int div =1; div<=num; div++) {
			if (num%div ==0) {
				count++;
			}
		}
		if(count ==2) {
			System.out.println("Number : "+ num+ " is prime");
		}else {
			System.out.println("Number : "+ num+ " is not prime");
		}
		
	}
	//method 2
	public static void isPrimenumber2(int num) {
		int count = 0;
		for(int div =2; div*div<=num; div++) {
			if (num%div ==0) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("Number : "+ num+ " is prime");
		}else {
			System.out.println("Number : "+ num+ " is not prime");
		}
		
	}
	//method 3
		public static void isPrimenumber3(int num) {
			int count = 0;
			for(int div =2; div*div<=num; div++) {
				if (num%div ==0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println("Number : "+ num+ " is prime");
			}else {
				System.out.println("Number : "+ num+ " is not prime");
			}
			
		}
	public static void main(String[] args) {
		isPrimenumber3(8);
		isPrimenumber3(71);
		isPrimenumber3(13);
	}

}
