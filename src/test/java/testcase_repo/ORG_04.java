package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreateOrganizationpage;
import ObjectRepository.Homepage;
import ObjectRepository.organizationpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class ORG_04 extends Baseclass
{
	@Test(groups= {"regression"})
	public void org04() throws Exception
	{
	JavaLibrary JUTIL=new JavaLibrary();
	int num=JUTIL.generateRandomNumber(1000);
	ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
	String ORGNAME=EUTIL.ReadindDataFromExcel ("Organization",11,1);
	String WEBSITE=EUTIL.ReadindDataFromExcel("Organization", 11, 2);
	String EMP=EUTIL.ReadindDataFromExcel("Organization", 11, 3);
	String PHN=EUTIL.ReadindDataFromExcel("Organization", 11, 4);
	String OTHPHN=EUTIL.ReadindDataFromExcel ("Organization",11,5);
	String EMAIL=EUTIL.ReadindDataFromExcel("Organization", 11, 6);
	String BILLADD=EUTIL.ReadindDataFromExcel("Organization", 11, 7);
	String BILLCITY=EUTIL.ReadindDataFromExcel ("Organization",11,8);
	String BILLSTATE=EUTIL.ReadindDataFromExcel("Organization", 11, 9);
	
	
	Homepage hp=new Homepage(driver);
	 hp.clickonOrg();
	 organizationpage op=new organizationpage(driver);
	 op.clickOnCreateOrgButton();
	
	
	 CreateOrganizationpage cop=new CreateOrganizationpage(driver);
	 cop.CreateOrganization(ORGNAME, WEBSITE, EMP, PHN, PHN, EMAIL, BILLADD, BILLCITY, BILLSTATE);
	System.out.println("ORG_04 excecution succeessfull");
	Thread.sleep(3000);
	}


}
