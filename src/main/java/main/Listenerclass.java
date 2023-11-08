package main;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.reporters.Files;

public class Listenerclass implements ITestListener{
	
	@Override
	//onTestStart method is called when any test starts.
	public void onTestStart(ITestResult result) {
		Reporter.log("test case started"+result.getName(),true);
	}
	@Override
	//method is called on the success of any test
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test case executed sucessfully"+result.getName(),true);
	}
	@Override
	// on the failure of any test
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh=(TakesScreenshot)Baseclass.driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\HX-31\\eclipse-workspace\\com.hxtra.hirextra\\src\\main\\resources\\screenshots"+result.getName()+".png");
		try {
		com.google.common.io.Files.copy(src, dist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
	

}
