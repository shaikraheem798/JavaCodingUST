package HKPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	boolean res;
	static WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver)
		{
		
		this.driver = driver;
		
		}
	//Element references
			By username = By.id("username");
			By password = By.id("password");
			By loginbtn = By.cssSelector("#login > button");
			By footer = By.partialLinkText("Selenium");
			
			
			//methods
			public boolean chkTitle(String exp_title)
			{
				String act_title =driver.getTitle();
				res = (act_title.equals(exp_title)) ? true : false;
				return res;
			}
			
			public void fillUsername(String s)
			{
				driver.findElement(username).sendKeys(s);
				
				
			}
			public void fillPassword(String p)
			{
				driver.findElement(password).sendKeys(p);
				
			}
			public void clickLoginbtn()
			{
				driver.findElement(loginbtn).click();
			}
			public boolean chkPagefooter()
			{
				try {
					driver.findElement(footer);
					res = true;
				}
				catch (NoSuchElementException e)
				{
				    res = false;
				}
				return res;
			}
			
		// A method to check if password is a password not showing characters
			
			public boolean isPasswordMasked()
			{
				
				String masked = driver.findElement(password).getAttribute("type");
			
			    res=masked.equals("password") ? true : false;
			    
			    return res;
			}

			
	}
					
				
			
				
			
	