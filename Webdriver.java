package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {

	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\mylearning\\chromedriver-win64\\chromedriver.exe");
				
		ChromeOptions options = new ChromeOptions();
	    options.setBrowserVersion("124");
	    driver = new ChromeDriver(options);
	    
	    //global wait- implicit wait 
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		String actual_title = driver.getTitle();
		String expected_title = "The Internet";
		
		
		if (actual_title.equals(expected_title))
		{
			System.out.println("Title test case Passed");
		}
		else
		{
			System.out.println("Failed");
		}	
		
		
		//check if Login button is present
		
		WebElement submitbtn = driver.findElement(By.cssSelector("#login > button"));
		
		String typeOfBtn = submitbtn.getAttribute("type");
		
		System.out.println("The type of button is " + typeOfBtn);
		
		//Check if password input is not exposing the typed passwords
		WebElement passwordtext = driver.findElement(By.id("password"));
		
		
		String typeOfText = passwordtext.getAttribute("type");
		
		System.out.println("Password field is of type " + typeOfText);

		
		//Check if footer has a link "Elemental Selenium"
		String expectedFooter = "Elemental Selenium";
		try {
		
			driver.findElement(By.linkText("Elemental Selenium"));
			System.out.println("Link " + expectedFooter+ " present in page. Page fully loaded.");
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Link " + expectedFooter+ " not present in page");
		}
		
	    driver.close();
	    
	}

	
}