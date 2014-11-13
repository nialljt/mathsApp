package FileIO;

import java.io.File;
import java.io.IOException;


public class FileDelete {

	public static void DeleteFile(String file) throws IOException{
		File f = new File(file);
		f.delete();
	}
	
}
