package testNG_Example;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class TrackTestExcution implements ITestNGListener{

	 public void onTestStart(ITestResult result) { 
	        System.out.println("onTestStart>> ");
	       }

	    public void onTestSuccess(ITestResult result) {
	        System.out.println("From Listener onTestSuccess>> PASSED");
	       }

	    public void onTestFailure(ITestResult result) { 
	    	
	        System.out.println("Failed for " + result.toString());
	        //you can take a screenshot here
	       }

	    public void onTestSkipped(ITestResult result) { 
	        System.out.println("onTestSkipped>> ");
	       }

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        System.out.println("onTestFailedButWithinSuccessPercentage>> ");
	       }

	    public void onStart(ITestContext context) {
	        System.out.println("onStart>> ");
	       }

	    public void onFinish(ITestContext context) { 
	        System.out.println("onFinish>> ");
	       }

}