package ImpJavaProgram.ImpJavaProgram.string;

public class CountCharacter {
	public static void main(String[] args) {
		countChar("Manish Kumar");
	}

	public static void countChar(String str) {
		int count = 0;
		// count each character except space
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		// display of total number of present character
		System.out.print("Total no of character : " + count);
	}

}
