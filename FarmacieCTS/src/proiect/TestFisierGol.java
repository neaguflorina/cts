package proiect;

import java.io.File;
import java.util.Scanner;

public class TestFisierGol {
	
	public boolean fileEmpty(File f){

		boolean empty = true;
		if(f==null)
			return empty=false;
		
		try {
			Scanner scanner;
			scanner = new Scanner(f);
			if(scanner.hasNext())
				empty=false;
			
			}
		 catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return empty;
	}
}
