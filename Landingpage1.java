package Capstoneproject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Landingpage1 {
	
	boolean res;
	static WebDriver driver;
	
	public Landingpage1(WebDriver driver)
	{
		this.driver = driver;
	}
	By flashsuccess = By.xpath("//*[@class=\"flash success\"]");
	
	public boolean isLoginsuccess()
	{
		try {
			driver.findElement(flashsuccess);
			res = true;
		}
		catch (NoSuchElementException e)
		{
		    res = false;
		}
		return res;
	}

}
	



