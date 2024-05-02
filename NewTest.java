package testNG_Example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class NewTest {
	boolean res;
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "abc", "ddd" },
	      new Object[] { "tomsmith", "supersecert" },
	    };
	 }	    
	    
  @Test(dataProvider = "dp")
  public void login(String u, String p) {
	  
	  System.out.println("username:" + u + "password");
	  
	  res = u.equals("tomsmith") ? true : false;
	  
	  Assert.assertEquals(true, res);
	  
	  
  }

  
  }

