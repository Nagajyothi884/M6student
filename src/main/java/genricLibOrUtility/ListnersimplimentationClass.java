package genricLibOrUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import bsh.NameSource.Listener;

public class ListnersimplimentationClass implements ITestListener
{
	public SeleniumUtility stil=new SeleniumUtility();
	@Override
	public void onTestStart(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName +"execution starts");
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName +"execution pass");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)Baseclass.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+methodName+".png");
		try
		{
			Files.copy(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName +"execution skip");
	}

}
