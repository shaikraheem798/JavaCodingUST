package TestCasess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Advantageshopping_PageFactory.AdvtHomePage_PageObject;
import utils1.openChromeBrowser1;



public class AdvtHomePage_PageObjectTestCase{
	static WebDriver driver;
	boolean res;
	static AdvtHomePage_PageObject advhp;

	@AfterClass
	public void CloseDriver()
	{
		//driver.quit();
	}
	
	
	@BeforeClass
	public void initDriver()
	{
		openChromeBrowser1 ob = new openChromeBrowser1();
		driver = ob.openChrome();
		driver.get("https://www.advantageonlineshopping.com/#/");
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    advhp = new AdvtHomePage_PageObject(driver);
		
	}
	
	@Test 
	public void clickSearchLens()
	{
		advhp.clickSearchLens();
	}
	
	
	@Test (dependsOnMethods = "clickSearchLens" )
	public void checkSearchBoxIsPresent()
	{
		Assert.assertEquals(true, advhp.chkSearchBoxIsPresent());
	}
	
	@Test (dependsOnMethods = "checkSearchBoxIsPresent" )
	public void enterSearchWord()
	{
		advhp.enterSearch("mouse");
	}
	
	
	@Test (dependsOnMethods = "enterSearchWord" )
	public void checkSearchResults()
	{
		Assert.assertEquals(true, advhp.chkresults());
	}
	
	//driver.findElement(By.id("autoComplete")).sendKeys(srch + Keys.ENTER);   
        
	
}	