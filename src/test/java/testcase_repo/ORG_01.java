package testcase_repo;

import org.testng.annotations.Test;

import ObjectRepository.CreateOrganizationpage;

import ObjectRepository.Homepage;

import ObjectRepository.organizationpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class ORG_01 extends Baseclass
{
	@Test(groups= {"regression"})
	public void org01() throws Exception
	{
	JavaLibrary JUTIL=new JavaLibrary();
	int num=JUTIL.generateRandomNumber(1000);
	ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
	String ORGNAME=EUTIL.ReadindDataFromExcel ("Organization",2,1);
	String WEBSITE=EUTIL.ReadindDataFromExcel("Organization", 2, 2);
	String EMP=EUTIL.ReadindDataFromExcel("Organization", 2, 3);
	
	Homepage hp=new Homepage(driver);
	 hp.clickonOrg();
	 organizationpage op=new organizationpage(driver);
	 op.clickOnCreateOrgButton();
	
	 CreateOrganizationpage cop=new CreateOrganizationpage(driver);
	 cop.CreateOrganization(ORGNAME+num, WEBSITE, EMP);
	System.out.println("ORG_01 excecution succeessfull");
	Thread.sleep(3000);
	}

}
