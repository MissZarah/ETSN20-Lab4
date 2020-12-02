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
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Write the pattern you want to find ");
	     String pattern = in.nextLine();
	     System.out.println("Write the name of the file you want to find the pattern in ");
	     String fileName = in.nextLine();
	     in.close();
	     search.printLines(pattern, fileName); 
		
	}

}
