package week3;

import java.util.stream.IntStream;

import acm.program.ConsoleProgram;
import acmx.export.java.util.Scanner;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public static String removeAllOccurrences() {
		
		
	
		
		   Scanner input = new Scanner(System.in);
	          System.out.println("Enter a string:");
		      String gg =input.nextLine();
	     //   } //String g1 = "I like soccer. It is my favourite sport:";
	            // String g2 = g1.substring( 2 , 9 );

	            String g2 = gg.substring( 2 , 17 );
	            System.out.println( g2 );
	            String gemeda = gg.substring( 1 , 9 );
	            System.out.println( gemeda );
	            //return g2;
		
		return gemeda;
		
		}
	
	  public void run() {
	
		  removeAllOccurrences();
	
	}
	
}
