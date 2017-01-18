package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleModelWinodw {
public static void main(String[] args) throws Exception {
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	int totalelements=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total number of frames are " +totalelements);
	driver.switchTo().frame("authiframe");
	driver.findElement(By.id("id_email")).sendKeys("ajay.pillagolla");
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame("authiframe");
	//driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	driver.findElement(By.id("id_password1")).sendKeys("155131331613");

	
}
}
