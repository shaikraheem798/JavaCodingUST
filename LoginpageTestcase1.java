package TestCasess;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Capstoneproject.Landingpage1;
import Capstoneproject.loginpage1;
import HKPages.LandingPage;
import HKPages.LoginPage;
import utils1.openChromeBrowser1;

public class LoginpageTestcase1 {
	static WebDriver driver;
	static loginpage1 lp1;
	static Landingpage1 landingpage1;
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
		lp1 = new loginpage1(driver);
		landingpage1 = new Landingpage1(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp1.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	
	
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp1.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp1.fillUsername("tomsmith");
		lp1.fillPassword("SuperSecretPassword!");
		lp1.clickLoginbtn();
		
		Assert.assertEquals(true,landingpage1.isLoginsuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp1.fillUsername("tomsmith");
		lp1.fillPassword("SuperSPassword!");
		lp1.clickLoginbtn();
		
		Assert.assertEquals(false,landingpage1.isLoginsuccess());
		
	}
	
	
}


 
