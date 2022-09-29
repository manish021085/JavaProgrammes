package ImpJavaProgram.ImpJavaProgram.string;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
			String str = "Big black bug bit a big black dog on his big black nose";
			
			str = str.toLowerCase();
			
			String[] words = str.split(" ");
			int length = words.length;
			
			for(int i=0; i<length;i++) {
				int count = 1;
				for(int j =i+1;j<length;j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j]="0";
					}
				}
				if(words[i] !="0 && count>1") {
					System.out.print(" "+words[i]+" ");
				}
			}

	}

}
