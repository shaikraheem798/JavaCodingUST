package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
//explicitly wait for username field to be visible before you send values to it	
		
			WebElement username=driver.findElement(By.id("username"));
				
			WebElement password = driver.findElement(By.id("password"));
		  enterValues(driver,username,Duration.ofSeconds(10),"tomsmith");
	      enterValues(driver,password,Duration.ofSeconds(5),"SuperSecretPassword!");
	      
	      driver.findElement(By.cssSelector("#login > button")).click();
	      
		  

	}

/* No explicit keyword or method
 * implicit and explicit waits should not be used together as the wait time will be increased
 * specific to element
 * dynamic in nature
 */
	
	public static void enterValues(WebDriver driver,WebElement element,Duration time,String val)
	{
		
		
		new WebDriverWait(driver,time)
		.until(ExpectedConditions.visibilityOf(element));
  	
		element.sendKeys(val);
		
		}

	
		


	}


