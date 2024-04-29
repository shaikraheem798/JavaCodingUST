package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class advantageOnlineShopping {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\mylearning\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	    options.setBrowserVersion("124");
	    driver = new ChromeDriver(options);
	    
	    //global wait- implicit wait 
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.advantageonlineshopping.com/#/");
		

	}

}
