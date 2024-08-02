package testcase_repo;


import org.testng.annotations.Test;

import ObjectRepository.Creatingleadpage;
import ObjectRepository.Homepage;
import ObjectRepository.Leadpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;

public class LE_04 extends Baseclass
{
	@Test(groups= {"smoke"})
	public void le04tc() throws Exception
	{
		ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
		String FNAME=EUTIL.ReadindDataFromExcel("Leads", 11, 1);
		String LNAME=EUTIL.ReadindDataFromExcel("Leads", 11, 2);
		String CNAME=EUTIL.ReadindDataFromExcel("Leads", 11, 3);
		String st=EUTIL.ReadindDataFromExcel("Leads", 11,4);
		String POBOX=EUTIL.ReadindDataFromExcel("Leads", 11,5);
		String PCode=EUTIL.ReadindDataFromExcel("Leads", 11,6);
		String city=EUTIL.ReadindDataFromExcel("Leads", 11,7);
		String Country=EUTIL.ReadindDataFromExcel("Leads", 11,8);
		String state=EUTIL.ReadindDataFromExcel("Leads", 11,9);
	 
		Homepage hp=new Homepage(driver);
		 hp.clickonLeads();
		Leadpage lp=new Leadpage(driver);
		lp.clickonCreateLeadButton();
		Creatingleadpage CNL=new Creatingleadpage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,st,POBOX,PCode,city,Country,state );
		System.out.println("LE04 excecution succeessfull");
		Thread.sleep(3000);
		
	}

}
