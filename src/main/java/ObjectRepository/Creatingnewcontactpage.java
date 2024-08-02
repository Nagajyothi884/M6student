package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creatingnewcontactpage 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement Title;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebutton;
	
	public Creatingnewcontactpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


public WebElement getFirstName() {
		return FirstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getTitle() {
		return Title;
	}


	public WebElement getSavebutton() {
		return Savebutton;
	}


/**
 * business library to crate contact with mandatory fields
 * @param firstName
 * @param lastName
 * @param orgName
 */
	public void Createcontact(String firstName, String lastName, String title) {
		FirstName.sendKeys(firstName);;
		LastName.sendKeys(lastName);;
		Title.sendKeys(title);
		Savebutton.click();
	}

	
	

}
