package FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	private String path;
	
	public FileWrite(String filePath){
		path = filePath;
		
	}
	public void writeToFile(String function, String plotPoints, String linePoints) throws IOException{
		FileWriter write = new FileWriter(path, false);
		PrintWriter print_line = new PrintWriter(write);
	    print_line.printf("%s\n%s\n%s", function, plotPoints, linePoints);
	    print_line.close();
	}
	
}
