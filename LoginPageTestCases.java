package TestCasess;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HKPages.LandingPage;
import HKPages.LoginPage;

import utils1.openChromeBrowser1;

public class LoginPageTestCases {
	static WebDriver driver;
	static LoginPage lp;
	static LandingPage landingpage;
	boolean res;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		
		openChromeBrowser1 ob = new openChromeBrowser1();
		driver = ob.openChrome();
		driver.get("https://the-internet.herokuapp.com/login");
		lp = new LoginPage(driver);
		landingpage = new LandingPage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	@Test
	public void chkToSeeIfFooterIsThere ()
	{
		
		Assert.assertEquals(true, lp.chkPagefooter()); 
		
	}
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSecretPassword!");
		lp.clickLoginbtn();
		
		Assert.assertEquals(true,landingpage.isloginsuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSPassword!");
		lp.clickLoginbtn();
		
		Assert.assertEquals(false,landingpage.isloginsuccess());
		
	}
	
	
}

