package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreateOrganizationpage;
import ObjectRepository.Homepage;
import ObjectRepository.organizationpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class ORG_02 extends Baseclass {

	@Test(groups= {"smoke"})
	public void org02() throws Exception
	{
	JavaLibrary JUTIL=new JavaLibrary();
	int num=JUTIL.generateRandomNumber(1000);
	ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
	String ORGNAME=EUTIL.ReadindDataFromExcel ("Organization",5,1);
	String WEBSITE=EUTIL.ReadindDataFromExcel("Organization", 5, 2);
	String EMP=EUTIL.ReadindDataFromExcel("Organization", 5, 3);
	String PHN=EUTIL.ReadindDataFromExcel ("Organization",5,4);
	String OTHPHN=EUTIL.ReadindDataFromExcel("Organization", 5, 5);
	String EMAIL=EUTIL.ReadindDataFromExcel("Organization", 5, 6);
	
	Homepage hp=new Homepage(driver);
	 hp.clickonOrg();
	 organizationpage op=new organizationpage(driver);
	 op.clickOnCreateOrgButton();
	
	
	 CreateOrganizationpage cop=new CreateOrganizationpage(driver);
	 cop.CreateOrganization(ORGNAME+num, WEBSITE, PHN, PHN, EMAIL);
	System.out.println("ORG_02 excecution succeessfull");
	Thread.sleep(3000);
	}

}
