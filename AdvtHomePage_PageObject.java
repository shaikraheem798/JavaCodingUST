package Advantageshopping_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AdvtHomePage_PageObject {
	
	static WebDriver driver;
	boolean res;
	
	public AdvtHomePage_PageObject(WebDriver driver)
	{
		
		this.driver = driver;
	}
        By menuSearchIcon = By.id("menuSearch");
        By searchBox_AutoComplete  = By.id("autoComplete");
        By results = By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p");
        
        public void clickSearchLens()
        {
        	driver.findElement(menuSearchIcon).click();
        }
        
        public boolean chkSearchBoxIsPresent()
        {
        	try {
        		
        		driver.findElement(searchBox_AutoComplete);
        	    res = true;
        		
        	}
        	catch(NoSuchElementException e)
        	{
        		res = false;
        	}
        	return res;
        }
        public void enterSearch(String s)
        {
        	driver.findElement(searchBox_AutoComplete).sendKeys(s);
        }
        
        public boolean chkresults()
        {
        	try {
        	String howmanyequalto = driver.findElement(results).getText();
        	System.out.println(howmanyequalto);
        	res = true;
        }
        	catch(NoSuchElementException e)
        	{
        		res = false;
        		
        	}
        	return res;
        }
        
        
}
