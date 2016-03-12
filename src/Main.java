
//import names.*;
import library.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) {
		
		FileReader input;
		try {
			input = new FileReader(new File("input"+System.getProperty("file.separator")+"input2.txt"));
		
			LibraryParserTokenManager scanner = new LibraryParserTokenManager(new SimpleCharStream(input));
			
//			Token t;
//			while ( (t = scanner.getNextToken()).kind != LibraryParserConstants.EOF ) {
//				System.out.println("Found token: "+t.image+"  " + t.kind);
//			}	
			
		  LibraryParser parser = new LibraryParser(input);
			parser.Library();
			System.out.println("Successfully parsed input!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
}