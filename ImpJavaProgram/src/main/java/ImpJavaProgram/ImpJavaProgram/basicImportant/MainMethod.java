package ImpJavaProgram.ImpJavaProgram.basicImportant;

public class MainMethod {
	
	//** org.apache.maven.archetypes  (group Id)
	//** maven-archetype-quickstart   (Artifact Id)
	//** 1.1                          (version)
	

	// default main method
//	public static void main(String[] args) {
//		System.out.println("Default main method");
//	}

	// replacement of main method used extra parameter
	// we can remove any added extra modifier
	final static synchronized strictfp public  void main(String... args) {
		System.out.println("Replacement of main method");
		System.out.println("maven quickstart dependency");
		System.out.println("org.apache.maven.archetypes  maven-archetype-quickstart  1.1");
		
	}

	// 1. valid change parameter in main method
//	public static void main(String[] args) {
//		System.out.println("Default main method");
//	}

	// 2. valid change parameter in main method
//	public static void main(String []args) {
//		System.out.println("Default main method");
//	}

	// 3. valid change parameter in main method
//	public static void main(String args[]) {
//		System.out.println("Default main method");
//	}

}
