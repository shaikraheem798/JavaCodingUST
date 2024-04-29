package fileHandling;

import java.io.*;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File myFile= new File("C://Users//ust.txt");
		System.out.println(myFile.exists());
		
		Scanner myScanner = new Scanner(myFile);

		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			System.out.println(line);
		}
	}

}
