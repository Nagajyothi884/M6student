package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



/**
 * this is pom class to click on create org button
 */
public class organizationpage 
{
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement CreateNewOrgButton;
	
	public WebElement getCreateNewOrgButton()
	{
		return CreateNewOrgButton;
	}
	public organizationpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	/**
	 * business lib to click on create new Lead
	 */
	public void clickOnCreateOrgButton()
	{
		CreateNewOrgButton.click();
	}
	
	
	

}
