import java.util.*;
import java.io.*;
import java.nio.file.*;

public class sortApp {
	
	public static void main(String[] args){
		Array File = new Array();

	
		// when you run it clears the old file and save the new on
		try {
			PrintWriter printwriter = new PrintWriter(new FileOutputStream(File.file.getName(),false));
			printwriter.print("");
			printwriter.close();// end of the file clearing process

			printwriter = new PrintWriter(new FileOutputStream(File.file.getName(),true));
			printwriter.println("Bubble Sort \t\tSelection Sort \t\tInsertion Sort");
			printwriter.println("=========== \t\t============== \t\t==============");
			printwriter.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Bubble Sort \t\tSelection Sort \t\tInsertion Sort");
		System.out.println("=========== \t\t============== \t\t==============");

		for(int j=1; j<10; j++){
			
		int size = 10000*j;
		Random r = new Random();
		
		r.setSeed(124);
		

		Array a = new Array(size);
		Array b = new Array(size);
		Array c = new Array(size);
		for(int i=0; i<size; i++){
			int x=(int)r.nextInt(100);
			a.add(x);
			b.add(x);
			c.add(x);
		}
		
		//a.display();
		a.bubbleSort();
		//b.display();
		b.selectionSort();
		//c.display();
		c.insertionSort();
				
	}
	}
}
