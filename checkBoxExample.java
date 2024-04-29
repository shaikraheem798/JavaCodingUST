package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxExample {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        driver = new ChromeDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("C:\\\\Users\\\\Administrator\\\\Documents\\\\ustpage.html");
		
	    boolean isRemembermeSelected= driver.findElement(By.name("rememberme")).isSelected();
		System.out.println(isRemembermeSelected);
  }



	}


