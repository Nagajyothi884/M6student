package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepository.Contactpage;
import ObjectRepository.Creatingnewcontactpage;
import ObjectRepository.Homepage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class Con_01 extends Baseclass 
{
	@Test(retryAnalyzer = genricLibOrUtility.RetryAnalyzerImplementationclass.class)
	
	public void con_01() throws Exception  
	{
		JavaLibrary JLIB =new JavaLibrary();
		int num=JLIB.generateRandomNumber(1000);
		ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
		String FNAME=EUTIL.ReadindDataFromExcel("Contacts", 1, 1);
		String LNAME=EUTIL.ReadindDataFromExcel("Contacts", 1, 2);
	    String TITLE=EUTIL.ReadindDataFromExcel("Contacts", 1, 3);
	    Homepage hp=new Homepage(driver);
	    hp.clickonContacts();
	    Contactpage cp=new  Contactpage(driver);
	    cp.clickOnCreateContactButton();
	    Creatingnewcontactpage cnc=new Creatingnewcontactpage(driver);
	    cnc.Createcontact(FNAME+num, LNAME, TITLE);
	    Thread.sleep(3000);
	}

}
