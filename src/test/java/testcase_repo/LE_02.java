package testcase_repo;


import org.testng.annotations.Test;

import ObjectRepository.Creatingleadpage;
import ObjectRepository.Homepage;
import ObjectRepository.Leadpage;
import genricLibOrUtility.Baseclass;
import genricLibOrUtility.ExcelUtilityorlib;

public class LE_02 extends Baseclass
{
	@Test(groups= {"regression"})
	
	public void le02tc() throws Exception
	{
		ExcelUtilityorlib EUTIL=new ExcelUtilityorlib();
		String FNAME=EUTIL.ReadindDataFromExcel("Leads", 5, 1);
		String LNAME=EUTIL.ReadindDataFromExcel("Leads", 5, 2);
		String CNAME=EUTIL.ReadindDataFromExcel("Leads", 5, 3);
		String TITLE=EUTIL.ReadindDataFromExcel("Leads", 5, 4);
		String Phone=EUTIL.ReadindDataFromExcel("Leads", 5, 5);
		String Mobile=EUTIL.ReadindDataFromExcel("Leads", 5, 6);
		String Email=EUTIL.ReadindDataFromExcel("Leads", 5, 7);
		String NOE=EUTIL.ReadindDataFromExcel("Leads", 5, 8);
		String st=EUTIL.ReadindDataFromExcel("Leads", 5, 9);
		String POBOX=EUTIL.ReadindDataFromExcel("Leads", 5, 10);
		String PCode=EUTIL.ReadindDataFromExcel("Leads", 5, 11);
		String city=EUTIL.ReadindDataFromExcel("Leads", 5, 12);
		String Country=EUTIL.ReadindDataFromExcel("Leads", 5, 13);
		String state=EUTIL.ReadindDataFromExcel("Leads", 5, 14);
	
		Homepage hp=new Homepage(driver);
		 hp.clickonLeads();
		Leadpage lp=new Leadpage(driver);
		lp.clickonCreateLeadButton();
		Creatingleadpage CNL=new Creatingleadpage(driver);
		CNL.createLead(FNAME, LNAME, CNAME,TITLE,Phone,Mobile,Email,NOE, st,POBOX,PCode,city,Country,state);
		System.out.println("LE02 excecution succeessfull");
		Thread.sleep(3000);
		
		
		
	}

}
