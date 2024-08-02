package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * this is pom class to create new lead
 */
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creatingleadpage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noofemployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	
	public Creatingleadpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoofemployees() {
		return noofemployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalcode() {
		return postalcode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/**
	 * Business Logic
	 * @param fname
	 * @param lname
	 * @param comp
	 */
	public void createLead(String fname,String lname,String comp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		saveBtn.click();
	}
	
	/**
	 * this is business library to create lead with all creds
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param desg
	 * @param phNo
	 * @param mob
	 * @param mailid
	 * @param employees
	 * @param strt
	 * @param pb
	 * @param postcode
	 * @param cty
	 * @param cntry
	 * @param st
	 */
	
	public void createLead(String fname,String lname,String comp,String desg,String phNo,String mob,String mailid,String employees,String strt,
			String pb,String postcode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phNo);
		mobile.sendKeys(mob);
		email.sendKeys(mailid);
		noofemployees.sendKeys(employees);
		street.sendKeys(strt);
		poBox.sendKeys(pb);
		postalcode.sendKeys(postcode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
	}
	
	/**
	 * this is business library to create lead with employeecreds
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param desg
	 * @param phNo
	 * @param mob
	 * @param mailid
	 * @param employees
	 */
	public void createLead(String fname,String lname,String comp,String desg,String phNo,String mob,String mailid,String employees)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phNo);
		mobile.sendKeys(mob);
		email.sendKeys(mailid);
		noofemployees.sendKeys(employees);
		saveBtn.click();
		
	}
	
	/**
	 * this is business library to create lead with employee address
	 * @param fname
	 * @param lname
	 * @param comp
	 * @param strt
	 * @param pb
	 * @param postcode
	 * @param cty
	 * @param cntry
	 * @param st
	 */
	
	public void createLead(String fname,String lname,String comp,String strt,
			String pb,String postcode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		street.sendKeys(strt);
		poBox.sendKeys(pb);
		postalcode.sendKeys(postcode);
		city.sendKeys(cty);
		country.sendKeys(cntry);
		state.sendKeys(st);
		saveBtn.click();
		
	}

	


	
	
	
	

}
