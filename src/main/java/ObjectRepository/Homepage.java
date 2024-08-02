package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	


	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath="//td[@class='genHeaderSmall']/following-sibling::td/img[@src='themes/softed/images/user.PNG']")
	private WebElement adminhover;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getAdminhover() {
		return adminhover;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
		
	}
	public void clickonLeads()
	{
		leads.click();
	}
	public void clickonOrg()
	{
		org.click();
	}
	public void clickonContacts()
	{
		contacts.click();
	}


	public void logoutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminhover).perform();
		logoutbtn.click();
		
	}

	
	

	
		
	}


