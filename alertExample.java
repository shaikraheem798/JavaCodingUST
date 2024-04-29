package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class alertExample {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        driver = new ChromeDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("file:/C:/Users/Administrator/Documents/alert.html");
				//driver.findElement(By.id("btnAlert")).click();
				driver.findElement(By.id("btnprompt")).click();
				//driver.switchTo().alert().sendKeys("automation");
				String text = driver.switchTo().alert().getText();
				System.out.println(text);
				driver.switchTo().alert().accept();
				String txt1 = driver.findElement(By.id("output")).getText();
				System.out.println(txt1);
		//driver.findElement(By.linkText("See an example alert")).click();

		//Wait for the alert to be displayed and store it in a variable
		//Alert alert = until(ExpectedConditions.alertIsPresent());

		//Store the alert text in a variable
		//String text = alert.getText();

		//Press the OK button
		//alert.accept();
  }

	
	}



	


