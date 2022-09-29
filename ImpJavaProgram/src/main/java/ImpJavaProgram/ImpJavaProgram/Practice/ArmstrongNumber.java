package ImpJavaProgram.ImpJavaProgram.Practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrong(153);

	}
	
	public static void isArmstrong(int num) {
		int cube =0;
		int rem, temp;
		temp =num;
		while (num>0) {
			rem = num%10;
			num = num/10;
			cube = cube + (rem * rem * rem);
		}
		if (temp == cube) {
			System.out.println(num + " is armstrong");
		}
		else {
			System.out.println(num + " is not armstrong");
		}
	}
	

}
