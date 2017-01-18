package Assertionsndverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifyerrormessage {
@Test
	public void verifymessage() throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		String url="https://mail.google.com/";

		driver.get(url);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		//String actualerror=driver.findElement(By.id("errormsg_0_Email")).getText();
		String actualerror=driver.findElement(By.id("errormsg_0_Email")).getAttribute("innerHTML");
		System.out.println(actualerror);
		String expectederror="Please enter your email. ";
		Assert.assertEquals(actualerror, expectederror);
		//Assert.assertTrue(actualerror.contains("your"));
		driver.quit();
		
}
}
