package ImpJavaProgram.ImpJavaProgram.string;

public class CapitalizeString2 {

	public static void main(String[] args) {
		String caps = capitalizeWord("manish automation practice"); //Manish Automation Practice
		System.out.println(caps);
		
		caps = capitalizeWord("automation "); //Automation
		System.out.println(caps);
		
		caps = capitalizeWord("s"); //S
		System.out.println(caps);
		caps = capitalizeWord(null); //M M M M
		System.out.println(caps);
		
		caps = capitalizeWord("m m m m"); //M M M M
		System.out.println(caps);
		
		caps = capitalizeWord("123"); //123
		System.out.println(caps);
		
		caps = capitalizeWord("123 manish automation practice"); //123
		System.out.println(caps);


	}
	
	public static String capitalizeWord(String str) {
		
		if(str == null) {
			System.out.println("null value is provided");
			return str;
		}
		
		if(str.length()==1) {
			str.toUpperCase();
		}
		
		String words[] = str.split("\\s");
		String result = "";
		
		for (String w: words) {
			String first = w.substring(0, 1).toUpperCase(); //M
			String restString = w.substring(1); //anish
//			result = result + first + restString; //ManishAutomationLab
			result = result + first + restString + " "; //Manish Automation Lab
		}
//		System.out.println("print the value : -> "+ result);
		return result.trim();
		
	}

}
