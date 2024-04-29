package fileHandling;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("After Formatting: " + formatDateTime);
		
		System.out.println(LocalTime.now().getHour());
		
		int curtime = LocalTime.now().getHour();
		String greet;
		
	
	
		if (curtime < 12) 
		{
			greet="Good morning";
			
		}
		else if (curtime >= 12 && curtime <16)
		{
			greet="Good afternun";
		}
		else if (curtime >=16 && curtime <=19)
		{
			greet="Good evening";
		}
		else
		{
			greet="Good night";
		}
					
		
		
		System.out.println(LocalTime.now().getHour() +" " +greet);
		}
		}

	


