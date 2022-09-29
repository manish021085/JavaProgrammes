package JavaExample.JavaExample.string;

public class CountCharacter {

	public static void main(String[] args) {

		String string = ";My name is Manish Kumar Singh";
		int count = 0;

		// count each character except space
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) != ' ') {
				count++;
			}

		}
		// display of total number of present character
		System.out.print("Total no of character : " + count);

	}

}
