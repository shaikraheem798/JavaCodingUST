package testNG_Example;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils1.ExcelApiTest;

public class Stage3_LoginDDExcel_ExtentReports {
 
	boolean res;

	public  ExtentTest test1;
	ExtentReports extent;
	static String xlFilePath = "d:\\Test.xlsx";
	static String sheetName = "Sheet1";

	static ExcelApiTest eat = null;

	@BeforeClass
	public void startTest()
	{
		System.out.println("Start test");
		LocalDateTime now = LocalDateTime.now();  

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm");  
		String formatDateTime = now.format(format);  

		String extentReportname="d:\\extentReport_" + formatDateTime + ".html";

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(extentReportname);
		//create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		test1 = extent.createTest("Extent reports demo", "test to validate test cases ");

		//initializing and starting the browser
		test1.log(Status.INFO, "Starting test case");


	}
	@AfterClass
	public void endTest() throws IOException
	{
		System.out.println("After class");

		extent.flush();

	}


	@DataProvider(name="dp")
	public Object[][] userdata() throws Exception {
		Object [][] data = testData(xlFilePath, sheetName);
		return data;

	}     

	@Test(dataProvider = "dp")
	public void loginmethod(String u, String p) {


		System.out.print("Username :"  + u + " Password:" + p + " --");

		res=u.equals ("tomsmith") ? true:false;
		System.out.println(res);

		if (res)
		{
			test1.log(Status.PASS, "Username "+ u + " Password:" + p + " Success");
			Reporter.log("Passed username:" + u + " Password:" + p );
		}
		else
		{
			test1.log(Status.FAIL, "Username "+ u + " Failed");
			Reporter.log("Failed username:" + u + " Password:" + p );
		}


		//do login with u and p
		Assert.assertEquals(true, res);
	}

	public static Object[][] testData(String xlFilePath, String sheetName) throws Exception
	{
		Object[][] excelData = null;
		eat = new ExcelApiTest(xlFilePath);
		int rows = eat.getRowCount(sheetName);
		int columns = eat.getColumnCount(sheetName);

		excelData = new Object[rows-1][columns];


		for(int i=1; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				excelData[i-1][j] = eat.getCellData(sheetName, j, i);
			}

		}
		return excelData;
	}

}