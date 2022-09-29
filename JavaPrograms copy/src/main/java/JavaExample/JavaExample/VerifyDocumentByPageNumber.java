package JavaExample.JavaExample;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class VerifyDocumentByPageNumber {

	public static void main(String[] args) throws IOException {
		
		PDDocument document = PDDocument.load(new File("/Users/manishkumar/Documents/Phoenix/JavaExample/file/1637911721178.pdf"));
		int count = document.getNumberOfPages();
		System.out.println("No.of page in document : " + count);
		if (!document.isEncrypted()) {
		    PDFTextStripper stripper = new PDFTextStripper();
		    String text = stripper.getText(document);
		    System.out.println("Text:" + text);
		}
		document.close();
		
	}

}
