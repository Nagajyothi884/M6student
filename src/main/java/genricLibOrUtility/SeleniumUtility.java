package genricLibOrUtility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	public Actions act=null;
	public Select s=null;
	
	/**
	 * this method is to maximize the window
	 * @param driver
	 */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * this method is using for implicit wait
	 * @param driver
	 * @param time
	 */
	public void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	/**
	 * this method is used to move to a particular element
	 * @param driver
	 * @param element
	 */
	public void movingTowardsAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	/**
	 * this method is used to click on an element
	 * @param driver
	 * @param element
	 */
	public void clickonElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.click(element).perform();
		
	}
	
	/**
	 * this method is used to scroll to a particular element 
	 */
	public void scrollToAparticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.scrollToElement(element).perform();
		
	}
	
	/**
	 * this method is used to drag an element to its destination 
	 */
	public void dragSrcToDest(WebDriver driver,WebElement src,WebElement dest)
	{
		act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
	}
	
	/**
	 * this method is used to drag a pointer
	 */
	public void dragPointer(WebDriver driver,WebElement src,int x,int y)
	{
		act=new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
		
	}
	

	/**
	 * this method is used to click and hold
	 */
	public void clickAndHoldAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.clickAndHold(element).perform();
		
	}
	

	/**
	 * this method is used to release an element
	 */
	public void ReleaseAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.release(element).perform();
		
	}
	

	/**
	 * this method is used to select an option from dropdown based on index
	 */
	public void selectAnElementBasedOnIndex(WebElement element,int indexNo)
	{
		s=new Select(element);
		s.selectByIndex(indexNo);
		
	}
	
	/**
	 * this method is used to select an option from dropdown based on attribute
	 */
	public void selectAnElementBasedOnAttribute(WebElement element,String value)
	{
		s=new Select(element);
		s.selectByValue(value);
		
	}
	
	/**
	 * this method is used to select an option from dropdown based on visibletext
	 */
	public void selectAnElementBasedOnVisibleText(WebElement element,String text)
	{
		s=new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	/**
	 * This method will give all the options
	 */
	public List<WebElement>getAllOptionsFromDropDown(WebElement element)
	{
		s=new Select(element);
		List<WebElement> options=s.getOptions();
		return options;
	}
	
	/**
	 * This method will give all the selected options
	 */
	public List<WebElement>getAllSelectedOptionsFromDropDown(WebElement element)
	{
		s=new Select(element);
		List<WebElement> options=s.getAllSelectedOptions();
		return options;
	}
	
	

	/**
	 * this method is used to deselect an option from dropdown based on index
	 */
	public void deselectAnElementBasedOnIndex(WebElement element,int indexNo)
	{
		s=new Select(element);
		s.deselectByIndex(indexNo);
		
	}
	
	/**
	 * this method is used to deselect an option from dropdown based on attribute
	 */
	public void deselectAnElementBasedOnAttribute(WebElement element,String value)
	{
		s=new Select(element);
		s.deselectByValue(value);
		
	}
	
	/**
	 * this method is used to deselect an option from dropdown based on visibletext
	 */
	public void deselectAnElementBasedOnVisibleText(WebElement element,String text)
	{
		s=new Select(element);
		s.deselectByVisibleText(text);
		
	}
	
	/**
	 * This method to deselect all the options
	 */
	public void deselectAllOptions(WebElement element)
	{
		s=new Select(element);
		s.deselectAll();
	}
	
	
	/**
	 * this method will help to accept the alert
	 */
	public void toAcceptAlert1(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	/**
	 * this method will help to accept the alert
	 */
	public void toDismissAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	/**
	 * this method will help to pass the alert msg
	 */
	public void toPasstAlertmsg(WebDriver driver ,String msg)
	{
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(msg);
	}
	
	/**
	 * this method will help to read the alert msg
	 */
	public String toFetchAlertmsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String alertMsg=alt.getText();
		return alertMsg;
	}
	
	/**
	 * This method will help us to perform js operations
	 */
	public void operationsWithJs(WebElement driver,String value)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(value);
	}
	
	
	/**
	 * This method is used to capture Screenshot
	 * @throws Exception 
	 */
	public void captureScreenshot(WebDriver driver,String path) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		Files.copy(src, dest);
	}
	
	/**
	 * Custom click
	 * @throws Exception 
	 */
	public void ifElementClickFails(WebDriver driver,WebElement element,int time) throws Exception
	{
		int count=0;
		int reclickcount=5;
		while(count<=reclickcount)
		{
			element.click();
			Thread.sleep(time);
			break;
		}
	}
	
	/**
	 * This method is to handle the window popup
	 */
	public void windowPopUpHandle(WebDriver driver)
	{
	    String parentWindow=driver.getWindowHandle();
		Set<String>allWindow=driver.getWindowHandles();
		Iterator<String>itr=allWindow.iterator();
		while(itr.hasNext())
		{
			String values=itr.next();
			String title=driver.switchTo().window(values).getTitle();
			if (title.contains(values))
			{
				break;
			}
		}
	}
	
	
	

	
	

}
