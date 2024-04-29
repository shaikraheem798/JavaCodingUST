package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter myWriter = new FileWriter("C:\\Users//newfile.txt");
		myWriter.write("Hello"+"\n\r");
		
		
		myWriter.append("Adding a new line");
		myWriter.flush();
		

	}

}
