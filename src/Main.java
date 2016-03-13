
//import names.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import lib.*;

public class Main {
	
	public static void main(String[] args) {
		
		FileReader input;
		try {
			input = new FileReader(new File("input"+System.getProperty("file.separator")+"input2.txt"));
		
//			LibParserTokenManager scanner = new LibParserTokenManager(new SimpleCharStream(input));		
//			Token t;
//			while ( (t = scanner.getNextToken()).kind != LibraryParserConstants.EOF ) {
//				System.out.println("Found token: "+t.image+"  " + t.kind);
//			}	
			
		  LibParser parser = new LibParser(input);
			parser.Library();
			System.out.println("Successfully parsed input!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
	}
}