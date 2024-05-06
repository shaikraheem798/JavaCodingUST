package HKPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	boolean res;
	static WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By flashsuccess = By.xpath("//*[@class=\"flash success\"]");
	
	public boolean isloginsuccess()
	{
		try {
			driver.findElement(flashsuccess);
			res =  true;
		}
		catch (NoSuchElementException e)
		{
		    res = false;
		}
		return res;
	}

}
