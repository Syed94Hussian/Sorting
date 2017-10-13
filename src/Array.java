import java.io.*;

public class Array {

	File file = new File("Info.txt");
	

	int size;
	int nElem=0;
	int a[];
	int b[];
	int c[];
	
//====================================================
	
	public Array() {
		// TODO Auto-generated constructor stub
		a = new int[100];
	}//endl of Array()
//====================================================
	
	public Array(int size){
		a = new int[size];
	}//end of Array(int size)
//====================================================
	
	public void add(int value){
		a[nElem]=value;
		nElem++;
	}//end of add()
//====================================================	
	public void display(){
		for(int i=0;i<nElem;i++){
		System.out.print(a[i]+" ");
		}
		System.out.print("");
	}//end of display()
//====================================================
	
public void bubbleSort(){
		
		long startTime = System.currentTimeMillis(); //start time

		int temp=0;
		for(int i = 0;i<nElem;i++){
			  for(int j=1; j < (nElem-i); j++){  
                  if(a[j-1] > a[j]){  
                         //swap elements  
                         temp = a[j-1];  
                         a[j-1] = a[j];  
                         a[j] = temp;  
                 }//end of if
			  }//end of inner loop
		}//end of outer loop
		long endTime   = System.currentTimeMillis(); // end time
    	long totalTime = endTime - startTime;
    	System.out.print(nElem +" = "+ totalTime/1000.0 + "\t");
	
	//print in the file 	
		try {
			PrintWriter printwriter = new PrintWriter(new FileOutputStream(file,true));
			printwriter.print(nElem +" = "+ totalTime/1000.0 + "\t");
			printwriter.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}//end of bubbleSort()
//====================================================

public void selectionSort(){
		
		long startTime = System.currentTimeMillis(); // start time 

			int out, in, min;
			for(out=0; out<nElem-1; out++) {
			min = out;
				for(in=out+1; in<nElem; in++){
					if(a[in] < a[min] ) min = in;//end of if condition
				}//end of inner for loop
				
				//swap
				int temp = a[out]; 
				a[out] = a[min]; 
				a[min] = temp;
			} // end outer loop 
			
		long endTime   = System.currentTimeMillis(); // end time
    	long totalTime = endTime - startTime;
    	System.out.print("\t" + nElem +" = "+totalTime/1000.0 + "\t\t");
    	
    	// print in the file 
    	try {
			PrintWriter printwriter = new PrintWriter(new FileOutputStream(file,true));;
			printwriter.print("\t" + nElem +" = "+totalTime/1000.0 + "\t\t");
			printwriter.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}// end selectionSort()
//====================================================

public void insertionSort(){
	
	long startTime = System.currentTimeMillis(); // start time

	int in, out;
	for(out=1; out<nElem; out++) {
		int temp = a[out];
		in = out;
		while(in>0 && a[in-1] >= temp)
		{
			a[in] = a[in-1]; --in;
		}//end of wile loop
		a[in] = temp;
	} // end of for loop

	long endTime   = System.currentTimeMillis(); //end time
	long totalTime = endTime - startTime;
	System.out.println(nElem +" = "+ totalTime/1000.0);
	
	// print in the file
	
	try {
		PrintWriter printwriter = new PrintWriter(new FileOutputStream(file,true));
		printwriter.println(nElem +" = "+ totalTime/1000.0);
		printwriter.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}// end insertionSort()
//====================================================

}//end of Array
