package ImpJavaProgram.ImpJavaProgram.random;

import java.util.UUID;

public class UUIDClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
		
		String randomString = uuid.toString();
		
		System.out.println("Random String : " + randomString);

	}

}
