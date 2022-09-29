package ImpJavaProgram.ImpJavaProgram.string;

public class CapitalizeString {

	public static void main(String[] args) {
		capitalizeWord("manish automation lab"); //Manish Automation Lab
		capitalizeWord("automation "); //Automation
		capitalizeWord("s"); //S


	}
	
	public static void capitalizeWord(String str) {
		
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
		System.out.println("print the value : -> "+ result);
		
	}

}
