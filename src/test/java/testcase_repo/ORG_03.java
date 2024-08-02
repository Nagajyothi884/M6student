package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreateOrganizationpage;
import ObjectRepository.Homepage;
import ObjectRepository.organizationpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class ORG_03 extends Baseclass
{
	@Test(groups= {"sanity"})
	public void org03() throws Exception
	{
	JavaLibrary JUTIL=new JavaLibrary();
	int num=JUTIL.generateRandomNumber(1000);
	ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
	String ORGNAME=EUTIL.ReadindDataFromExcel ("Organization",8,1);
	String WEBSITE=EUTIL.ReadindDataFromExcel("Organization", 8, 2);
	String BILLADD=EUTIL.ReadindDataFromExcel("Organization", 8, 3);
	String BILLCITY=EUTIL.ReadindDataFromExcel ("Organization",8,4);
	String BILLSTATE=EUTIL.ReadindDataFromExcel("Organization", 8, 5);
	
	
	Homepage hp=new Homepage(driver);
	 hp.clickonOrg();
	 organizationpage op=new organizationpage(driver);
	 op.clickOnCreateOrgButton();
	
	
	 CreateOrganizationpage cop=new CreateOrganizationpage(driver);
	 cop.CreateOrganization(ORGNAME, WEBSITE, BILLADD, BILLCITY, BILLSTATE);
	System.out.println("ORG_03 excecution succeessfull");
	Thread.sleep(3000);
	}


}
