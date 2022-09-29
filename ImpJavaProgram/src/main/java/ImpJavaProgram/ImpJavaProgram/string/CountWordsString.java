package ImpJavaProgram.ImpJavaProgram.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsString {

	public static void main(String[] args) throws IOException {

		String line;
		int count = 0;
		// open file in read mode
		FileReader file = new FileReader("/Users/manishkumar/Documents/Phoenix/JavaExample/data.txt");
		BufferedReader br = new BufferedReader(file);

		// get each line till end of the file is reached
		while ((line = br.readLine()) != null) {
			// splits each line into words
			String words[] = line.split("");
			// count each word
			count = count + words.length;
		}
		System.out.println("Number of words present in given file: " + count);
		br.close();

	}

}
