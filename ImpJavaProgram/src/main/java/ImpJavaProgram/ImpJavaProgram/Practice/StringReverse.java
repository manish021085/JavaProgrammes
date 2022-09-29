package ImpJavaProgram.ImpJavaProgram.Practice;

public class StringReverse {

	public static void main(String[] args) {
		ReverseString();

	}
	
	public static void ReverseString() {
		String str = "my name is manish";
		String reverse="";
		System.out.println("String before reverse:-> "+ str);
		for(int i=str.length()-1; i>=0; i--) {
			reverse= reverse+str.charAt(i);
		}
		System.out.println("String after reverse:-> "+ reverse);	
	}

}
