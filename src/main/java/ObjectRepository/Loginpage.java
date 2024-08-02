package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void loginOperation(String uname,String pass)
	{
		getUsername().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLogin().click();
	}
	
	


}
