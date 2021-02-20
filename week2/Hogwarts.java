package week2;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GRoundRect;
import acm.program.ConsoleProgram;
import acm.program.DialogProgram;
import acm.program.GraphicsProgram;

public class Hogwarts extends ConsoleProgram {

	
	
	
	
	
	public void run() {
		
		bludger(2001);
		
		
		
	}

	private void bludger(int y) {
		int x = y / 1000;
		
		int z = (x  + y);
		
	  
		// below is the method  to know the value of x using the passed parameter value y and z
		
		x = quaffle(z, y);
	   
	  println("bludger: x = " + x + ", y =  "+ y + ", z = " + z);
	
	
	}

	private int quaffle(int x, int y) {   // fix
		
		int z = snitch( x + y, y);
		
		y = y/z;;
		
		println("quaffle: x = "+ x + ", y= " + y + ", z=" + z);
		
		return z;
	
	}

	private int snitch(int x, int y) {
		
		
	y = x / (x % 10);

	println("snitch: x ="+ x + "y=" + y);
	
	return y;
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

