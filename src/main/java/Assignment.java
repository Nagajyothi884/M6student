import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();	
		driver.findElement(By.xpath("//a[text()='Leads'][1]")).click();
		driver.findElement(By.xpath("//a[text()='Leads'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nagajyothi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vepamanu");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("DXC");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6303826797");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9052437010");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyothiroyal9@gmail.com");
		driver.findElement(By.xpath("//select[@name='leadsource']")).click();
		Robot r=new Robot();
		for(int i=0;i<=3;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//select[@name='industry']")).click();
		Robot r1=new Robot();
		for(int i=0;i<=1;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		driver.findElement(By.xpath("//select[@name='rating']")).click();
		Robot r2=new Robot();
		for(int i=0;i<=1;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//select[@name='leadstatus']")).click();
		Robot r3=new Robot();
		for(int i=0;i<=3;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='lane']")).sendKeys("durganagar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"code\"]")).sendKeys("515122");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@name='pobox']")).sendKeys("somandepalli");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("anantapur");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Ap");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.gif']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	
		
		
		
		
	}
	
}
