package ImpJavaProgram.ImpJavaProgram.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadNotepadFile {
	// define current directory
	public static String currentDir = System.getProperty("user.dir");

	public static void main(String[] args) throws Exception {

		usingBufferedReader();
		usingFileReader();
		usingScanner();

	}

	// Method 1: Using BufferedReader class
	public static void usingBufferedReader() throws IOException {
		
		File file = new File(currentDir + "/readDataFile/Readme.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;

		while ((str = br.readLine()) != null)
			System.out.println("File text using BufferedReader : " + str);
	}

	// Method 2: Using FileReader class
	public static void usingFileReader() throws Exception {
		
		FileReader fileReader = new FileReader(currentDir + "/readDataFile/Readme.txt");

		int i;
		while ((i = fileReader.read()) != -1)
//			System.out.println("File text using FileReader : " + "/n");
			System.out.print((char)i);
	}
	
	//Method 3: Using Scanner class
	public static void usingScanner() throws FileNotFoundException {
		
		File file = new File(currentDir + "/readDataFile/Readme.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
			System.out.println("\r" + sc.nextLine());
	}

}
