package Advantageshopping_PageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search_Page {
	
	 static WebDriver driver;

	public  static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\RedBus.com.exe");
		
		ChromeOptions options = new ChromeOptions();
	    options.setBrowserVersion("124");
	    driver = new ChromeDriver(options);
	    driver.get("https://www.advantageonlineshopping.com/#/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	    String srch = "ssabc";
	    driver.findElement(By.id("menuSearch")).click();
	    driver.findElement(By.id("autocomplete")).sendKeys(srch + Keys.ENTER);
	    
	    try {
	    	String searches = driver.findElement(By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p")).getText();
	    	System.out.println(searches);
	    }
	    catch(NoSuchElementException e)
	    {
	    	System.out.println("no item found for: " + srch);
	    	
	    }
	    }
	    
		
		

	}


