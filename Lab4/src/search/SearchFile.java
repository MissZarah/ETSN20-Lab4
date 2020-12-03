package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchFile {
	 
	
	public SearchFile() {}
	
	
	public void printLines(String pattern, String fileName) throws FileNotFoundException {
		 
		   
	   File file = new File(fileName);
	   Scanner fileReader = new Scanner(file);
	   
	   while (fileReader.hasNextLine()) {
	        String line = fileReader.nextLine();
	    if( line.toLowerCase().indexOf(pattern.toLowerCase()) != -1 )
	        System.out.println(line);
	      }
	   fileReader.close();
		
	}
	
	
	
	
	public static void main(String args[]) throws FileNotFoundException {
		
		SearchFile search  = new SearchFile();
	    search.printLines(args[0],args[1]); 
		
	}

}
