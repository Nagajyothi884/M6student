package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage 
{
	@FindBy(xpath="//img[@title='Create Contact..']")
	private WebElement createcontactbutton;
	
	public WebElement getcreatecontactbutton() {
		return createcontactbutton;
	}
	
	public Contactpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	/**
	 * business lib to click on create new Lead
	 */
	public void clickOnCreateContactButton()
	{
		createcontactbutton.click();
	}

	
	

}
