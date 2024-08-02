package testcase_repo;


import org.testng.annotations.Test;

import ObjectRepository.Creatingleadpage;
import ObjectRepository.Homepage;
import ObjectRepository.Leadpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;

public class LE_03 extends Baseclass
{
	@Test(groups= {"sanity"})
	
	public void le02tc() throws Exception
	{
		ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
		String FNAME=EUTIL.ReadindDataFromExcel("Leads", 8, 1);
		String LNAME=EUTIL.ReadindDataFromExcel("Leads", 8, 2);
		String CNAME=EUTIL.ReadindDataFromExcel("Leads", 8, 3);
		String TITLE=EUTIL.ReadindDataFromExcel("Leads",8, 4);
		String Phone=EUTIL.ReadindDataFromExcel("Leads", 8, 5);
		String Mobile=EUTIL.ReadindDataFromExcel("Leads", 8, 6);
		String Email=EUTIL.ReadindDataFromExcel("Leads", 8, 7);
		String NOE=EUTIL.ReadindDataFromExcel("Leads", 5, 8);
		
		
		Homepage hp=new Homepage(driver);
		 hp.clickonLeads();
		Leadpage lp=new Leadpage(driver);
		lp.clickonCreateLeadButton();
		Creatingleadpage CNL=new Creatingleadpage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,TITLE,Phone,Mobile,Email,NOE );
		System.out.println("LE03 excecution succeessfull");
		Thread.sleep(3000);
	}

}
