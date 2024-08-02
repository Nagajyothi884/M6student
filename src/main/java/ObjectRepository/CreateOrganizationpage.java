package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationpage
{

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement empNo;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phnNo;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhnNo;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement emailId;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billingCity;
	
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	public CreateOrganizationpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmpNo() {
		return empNo;
	}

	public WebElement getPhnNo() {
		return phnNo;
	}

	public WebElement getOtherPhnNo() {
		return otherPhnNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	/**
	 * Business lib to create new organizationwith mandatory fields
	 * @param Orgname
	 * @param website
	 * @param employees
	 */
	public  void CreateOrganization(String Orgname ,String website,String employees)
	{
		orgName.sendKeys(Orgname);
		webSite.sendKeys(website);
		empNo.sendKeys(employees);
	}
	
	public  void CreateOrganization(String Orgname ,String website ,String phone,String otherphone,String mailid)
	{
		orgName.sendKeys(Orgname);
		webSite.sendKeys(website);
		
		phnNo.sendKeys(phone);
		otherPhnNo.sendKeys(otherphone);
		emailId.sendKeys(mailid);
		saveBtn.click();
	}
	
	public  void CreateOrganization(String Orgname ,String website,String employees ,String Baddress,String Bcity,String Bstate)
	{
		orgName.sendKeys(Orgname);
		webSite.sendKeys(website);
		empNo.sendKeys(employees);
		billingAddress.sendKeys(Baddress);
		billingCity.sendKeys(Bcity);
		billingState.sendKeys(Bstate);
		saveBtn.click();
	}
	
	public  void CreateOrganization(String Orgname ,String website,String employees ,String phone,String otherphone,String mailid,String Baddress,String Bcity,String Bstate)
	{
		orgName.sendKeys(Orgname);
		webSite.sendKeys(website);
		empNo.sendKeys(employees);
		phnNo.sendKeys(phone);
		otherPhnNo.sendKeys(otherphone);
		emailId.sendKeys(mailid);
		billingAddress.sendKeys(Baddress);
		billingCity.sendKeys(Bcity);
		billingState.sendKeys(Bstate);
		saveBtn.click();
	}




	
	




	
	
	
	
	

}
