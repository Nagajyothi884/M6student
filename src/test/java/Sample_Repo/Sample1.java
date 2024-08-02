package Sample_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import genricLibOrUtility.Baseclass;
@Listeners(genricLibOrUtility.ListnersimplimentationClass.class)
public class Sample1 
{
	public class sample1 extends Baseclass
	{
		public void loginOperationCrossCheck()
		{
			driver.findElement(By.xpath("hihfynk")).click();
		}
	}

}
