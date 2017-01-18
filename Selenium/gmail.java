package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gmail {
	public WebDriver driver;
	@BeforeMethod
	public void Setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Gmail() throws Exception{
		driver.findElement(By.id("Email")).sendKeys("ajay.pillagolla@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Passwd")).sendKeys("9059026263");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	

}
