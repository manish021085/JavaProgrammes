package ImpJavaProgram.ImpJavaProgram.random;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CreateRandomNumber {

	public static void main(String[] args) {
		
		//Create Random Number 
		//1st method
//		double randomNumber1 = Math.random();
//		System.out.println("RandomNumber 1 : "+randomNumber1);
		
		//2nd method
//		int randomNumber2 = ThreadLocalRandom.current().nextInt();
//		System.out.println("RandomNumber 2 : "+randomNumber2);
		
		//3rd method
		Random random = new Random();
		int rnum1 = random.nextInt(100000);
		System.out.println("RandomNumber 1 : "+rnum1);
		
//		double rnum2 = random.nextDouble();
//		System.out.println("RandomNumber 1 : "+rnum2);
//		
//		long rnum3 = random.nextLong();
//		System.out.println("RandomNumber 1 : "+rnum3);
		

	}

}
