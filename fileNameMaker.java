package utils1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class fileNameMaker {
	
	public String fileNameForLogin(String u, String p)
	{
		String fileName;
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting:" + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyyy HH-mm");
		fileName = "C:\\Users\\Administrator\\Desktop\\Images\\"+ u + "_"+ p +"_" + now.format(format)+".jpg";
		
		return (fileName);
	}

}
