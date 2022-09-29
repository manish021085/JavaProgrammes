package ImpJavaProgram.ImpJavaProgram.string;

import java.util.Arrays;

public class Anagram {
/**
 * Two Strings are called the anagram if they contain the same characters. 
 * However, the order or sequence of the characters can be different
 */
	public static void main(String[] args) {
		
		String str1 = "Manish";
		String str2 = "Hsinam";
		
		//converting in lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//checking the length of string
		if(str1.length() != str2.length()) {
			System.out.println("Both strings are not anagram");
		}
		else {
			//converting both arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			//sorting array
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			//comparing both array
			if(Arrays.equals(string1, string2)== true) {
				System.out.println("Both the strings are anagram");
			}
			else {
				System.out.println("Both the strings are not anagram");
			}
		}
		
	}

}
