package ObjectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class to create new lead button page
 */

public class Leadpage 
{
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLeadBtn;

	public Leadpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateLeadBtn() {
		return createLeadBtn;
	}
	public void clickonCreateLeadButton()
	{
		createLeadBtn.click();
		
	}
	

	

	
	
	

}
