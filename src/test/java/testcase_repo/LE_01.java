package testcase_repo;


import org.testng.annotations.Test;

import ObjectRepository.Creatingleadpage;
import ObjectRepository.Homepage;
import ObjectRepository.Leadpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;
import genricLibOrUtility.JavaLibrary;

public class LE_01 extends Baseclass
{
	@Test(groups= {"regression"})
	public void le01TC() throws Exception
	{
		JavaLibrary JUTIL=new JavaLibrary();
		int num=JUTIL.generateRandomNumber(1000);
		ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
		String FNAME=EUTIL.ReadindDataFromExcel("Leads", 2, 1);
		String LNAME=EUTIL.ReadindDataFromExcel("Leads", 2, 2);
		String COMP=EUTIL.ReadindDataFromExcel("Leads", 2, 3);
		
		
		Homepage hp=new Homepage(driver);
		 hp.clickonLeads();
		Leadpage lp=new Leadpage(driver);
		lp.clickonCreateLeadButton();
		
		Creatingleadpage CNL=new Creatingleadpage(driver);
		CNL.createLead(FNAME, LNAME, COMP);
		System.out.println("LE01 excecution succeessfull");
		Thread.sleep(3000);
	}

}
