package Sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program4 
{
	@Test
	public void Strictlevelcomparision()
	{
		String Expectedvalue="raja";
		String actualvalue="raja";
		Assert.assertEquals(actualvalue, Expectedvalue);
		System.out.println("assertion passed");
		
	}
	@Test
	public void containslevel()
	{
		String expectedvalue="raja";
		String actualvalue="maharaja";
		Assert.assertTrue(actualvalue.contains(expectedvalue));
		System.out.println("contains passed");
	}

}
