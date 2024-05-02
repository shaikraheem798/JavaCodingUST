package testNG_Example;

import org.testng.annotations.Test;

public class Testng1_Tc {
  @Test 
  public void h() {
	  
	  System.out.println("a method is excute last");
  }
  
  @Test(dependsOnMethods="h")
  public void g() {
	  
	  System.out.println("a method is excute first");
  }
}
