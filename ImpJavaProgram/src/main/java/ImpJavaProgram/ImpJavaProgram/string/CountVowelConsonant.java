package ImpJavaProgram.ImpJavaProgram.string;

public class CountVowelConsonant {

	public static void main(String[] args) {
		//counter variable to store the count of vowels and consonent
		int vCount = 0;
		int cCount = 0;
		//declare a string
		String str = "this is a really simple sentence";
		
		//converting entire string to lower case to reduse the comparisons
		str = str.toLowerCase();
		
		for(int i = 0;i<str.length(); i++) {
			
			//check weather a character is a vowel
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.println("Number of Vowels : "+ vCount);
		System.out.println("Number of Consonents : "+ cCount);
	}

}
