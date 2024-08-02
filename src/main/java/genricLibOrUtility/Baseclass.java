package genricLibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.Homepage;
import ObjectRepository.Loginpage;

public class Baseclass 
{
	public static WebDriver driver=null;
	public propertiesUtilorlib PUTIL=null;
	public SeleniumUtility SUTIL=new SeleniumUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void createDbConnection()
	{
		System.out.println("db connection successfull!!");
	}
	
	@BeforeClass(alwaysRun=true) 
	public void launchBrowser() throws Exception
	{
		PUTIL=new propertiesUtilorlib();
		String URL=PUTIL.getDatafromproperties("url");
		driver=new ChromeDriver();
		SUTIL.implicitwait(driver, 10);
		SUTIL.maximizewindow(driver);
		driver.get(URL);
		System.out.println("Launching successfull");
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception
	{
		String USERNAME=PUTIL.getDatafromproperties("username");
		String PASSWORD=PUTIL.getDatafromproperties("password");
		Loginpage lp=new Loginpage(driver);
		lp.loginOperation(USERNAME,PASSWORD);
		System.out.println("login successfull");
		}
	
	@AfterMethod(alwaysRun=true)
	public void logoutOperation()
	{
		Homepage hp=new Homepage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout successfull");
		
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeDbCnnection()
	{
		System.out.println("db connection closed");
	}
	
	
	

}
