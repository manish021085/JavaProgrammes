package ImpJavaProgram.ImpJavaProgram.random;

import java.util.Random;
import java.util.UUID;

public class CreateRandomString {

	public static void main(String[] args) {

		// create a string for all characters
//		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String alphabet = "!@#$%^&*()_+ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// create a random string builder
		StringBuilder sb = new StringBuilder();

		// create an object of random class
		Random random = new Random();

		// specify length of random string
		int length = 7;
		for (int i = 0; i < length; i++) {
			// generate random index numer
			int index = random.nextInt(alphabet.length());

			// get character specified by index from string
			char randomChar = alphabet.charAt(index);

			// appenend the charactor to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		System.out.println("Random String 1 : " + randomString);
		
		System.out.println("**********************");
		
//		Random random = new Random();
		int rnum1 = random.nextInt(100000);
		System.out.println("RandomNumber 1 : "+rnum1);
		
		System.out.println("**********************");
		
		for(int i=0; i<=10; i++) {

		UUID uuid = UUID.randomUUID();
		
		

		String randomStringUUID = uuid.toString();

		String nu77 = randomStringUUID.substring(28);
		
		System.out.println("Random String 2: " + nu77);
		}

	}

}
