package fileHandling;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Scanner;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment {
	
	//public boolean actualresult;
	public static String actualgreet;
	public static String expectedgreet;
	//public boolean results;
	
	@BeforeClass
	public static void readPropertyfile ()throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\ust\\src\\fileHandling\\config.properties");
		p.load(fis);
		for (Entry<Object, Object> e :p.entrySet()) {
			System.out.println(e);
		}
		
		expectedgreet = p.getProperty("expectedgreeting");
		System.out.println("Expected result:" + expectedgreet);	

	}


	@Test
	public void currtime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("After Formatting: " + formatDateTime);
		
		System.out.println(LocalTime.now().getHour());
		
		int curtime = LocalTime.now().getHour();
		//String greet;
		
	
	
		if (curtime < 12) 
		{
			actualgreet="Good morning";
			
		}
		else if (curtime >= 12 && curtime <16)
		{
			actualgreet="good afternoon";
		}
		else if (curtime >=16 && curtime <=19)
		{
			actualgreet="Good evening";
		}
		else
		{
			actualgreet="Good night";
		}
					
		
		
		System.out.println(LocalTime.now().getHour());
		System.out.println("Actual Result: " + actualgreet);
		Assert.assertEquals(actualgreet, expectedgreet);
		}
		
	}


