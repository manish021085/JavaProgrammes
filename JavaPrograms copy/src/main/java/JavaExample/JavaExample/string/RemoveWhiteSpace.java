package JavaExample.JavaExample.string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "Remove : white space";
		
		//remove white space
		str = str.replaceAll("\\s+", "");
		System.out.println("String after white space : " + str);

	}

}
