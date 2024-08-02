package Sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program5 
{
	@Test
	public void Strictlevelcomparision()
	{
		String Expectedvalue="raja";
		String actualvalue="Raja";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualvalue, Expectedvalue);
		System.out.println("assertion passed!!");
		sf.assertAll();
		
	}
	@Test
	public void containslevel()
	{
		String expectedvalue="raja";
		String actualvalue="maharaja";
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(actualvalue.contains(expectedvalue));
		System.out.println("contains passed!!");
		sf.assertAll();
	}

}
