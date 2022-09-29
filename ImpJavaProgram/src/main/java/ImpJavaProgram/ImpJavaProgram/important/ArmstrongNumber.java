package ImpJavaProgram.ImpJavaProgram.important;

public class ArmstrongNumber {
	/**
	 * In case of an Armstrong number of 3 digits, 
	 * 153 = 1*1*1 + 5*5*5 + 3*3*3   
	 * 153 is an Armstrong numberthe sum of cubes of each digits is equal to the number itself
	 */
	public static void main(String[] args) {
		
		isArmstrongNum(153);
		isArmstrongNum(154);

	}
	
	public static void isArmstrongNum(int num) {
		
		int cube =0;
		int r, t;
		t=num;
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube + (r*r*r);
		}
		if(t == cube) {
			System.out.println("Number is armstrong Number");
		}
		else {
			System.out.println("Number is not armstrong Number");
		}
		
		
//		int number = num;
//		int total = 0;
//		int temp;
//		while(num != 0) {
//			temp = num%10;
//			total = total + (temp*temp*temp);
//			num = num/10;
//		}
//		if(number == total) {
//			System.out.println(num + " is armstrong Number");
//		}
//		else {
//			System.out.println(num + " is not armstrong Number");
//		}
	}

}
