package ImpJavaProgram.ImpJavaProgram.string;

public class ReverseString2 {
	public static void main(String args []) {
		String strr= "manish kumar";
		reverseString(strr);
	}
	
	public static void reverseString(String str) {
//		String str= "manish kumar";
		String rstr= "";
		char cha;
		for(int i=0; i<str.length(); i++) {
			cha = str.charAt(i);
			rstr = cha+rstr;
		}
		System.out.print("Reverse String is :-> "+ rstr);
	}

}
