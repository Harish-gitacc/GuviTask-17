package task17;
import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DemoblazeLoginVerify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		//driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("signin2"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	
		Thread.sleep(50);
		
		driver.findElement(By.id("signin2")).click(); 
		
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("dabon53489@hidelux.com");
		
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("testingphase1");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();

		// to check the registration is successfull or not
		String TitleAfterSignup = driver.getTitle();
		if (TitleAfterSignup.equals("STORE"))
		{
		    System.out.println("Registration Successful!");
		}
		else
		{
		    System.out.println("Registration Failed.");
		}
		
		
}
}

OUTPUT:
Registration Successful!