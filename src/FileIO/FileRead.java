package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class FileRead {
private static String function = "";
private static String plotpoints = "";
private static String linepoints = "";
File fFile;
int count = 0;

public FileRead(String fPath){
	fFile = new File(fPath);
	
}
public final void processLineByLine() throws FileNotFoundException {
    Scanner scanner = new Scanner(new FileReader(fFile));
    try {
      //first use a Scanner to get each line
      for(int i = 0; i < 3; i++){
        processLine( scanner.nextLine() );
      }
    }
    finally {
      scanner.close();
    }
  }
protected void processLine(String aLine){
    //use a second Scanner to parse the content of each line 
	
    Scanner scanner = new Scanner(aLine);
    scanner.useDelimiter("   ");
    if ( scanner.hasNext() ){
      //String value = scanner.next();
    	if(count ==0){
    		function = scanner.next();
    	}else if(count == 1){
    		plotpoints = scanner.next();
    	}else if(count == 2){
    		linepoints = scanner.next();
    	}
    	count++;
    }
    else {
      System.out.println("Empty or invalid line. Unable to process.");
    }
    
  }
public String getFunction(){
	return function;
}
public String getplotpoints(){
	return plotpoints;
}
public String getlinepoints(){
	return linepoints;
}
}
