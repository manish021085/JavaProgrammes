package ImpJavaProgram.ImpJavaProgram.java;

import java.util.Scanner;

public class Codition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks();
	}
	
	public static void StudentMarks() {
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();
		
		if(marks>90) {
			System.out.println("Excellent result more than 90");
		}else if(marks<= 80){
			System.out.println("good result less than and equal 80");
		}else if(marks<=70) {
			System.out.println("fair result less than and equal 70");
		}else if(marks<=60) {
			System.out.println("fair result meets expectation");
		}else if(marks <60) {
			System.out.println("poor result");
		}
		
	}

}
