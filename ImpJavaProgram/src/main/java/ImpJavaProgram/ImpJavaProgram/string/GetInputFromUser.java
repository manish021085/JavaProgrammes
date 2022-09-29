package ImpJavaProgram.ImpJavaProgram.string;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an string : ");
		str = scan.next();
		System.out.println("\n you have entered : "+ str);

	}

}
