package testNG_Example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utils.ExcelApiTest;

public class stage2_logindpwithExcel {
	
	boolean res;
	String xlFilePath = "d:\\Test.xlsx";
	String sheetName = "Sheet1";
	ExcelApiTest eat = null;
	
	
	@DataProvider
	  public Object[][] dp(){
	    return new Object[][] {
	    	Object[][] dataexcel = readfromexcel(xlFilePath, sheetName);
	        return dataexcel;
	    }
}	
	
	 @Test(dataProvider = "dp")
	  public void login(String u, String p) {
			
			System.out.println("Username:" + u + " Password " + p);
	  
		res = u.equals("tomsmith") ? true : false;
		
		Assert.assertEquals(true,res);	
	}

		
	  
	  
	  
	public Object[][] readfromexcel(String xlFilePath, String sheetName) throws Exception
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

