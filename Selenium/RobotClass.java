package AutomationFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotClass {

	public WebDriver driver;
	public String url="https://www.gmail.com";
	@BeforeTest
	public void setUP(){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws Exception{
		driver.findElement(By.id("Email")).sendKeys("ajay.pillagolla@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("9059026263");
		driver.findElement(By.id("signIn")).click();

		//click on compose
		driver.findElement(By.xpath(".//*[@id=':4l']/div/div")).click();
		driver.findElement(By.xpath(".//*[@id=':qy']")).click();
		Robot rb=new Robot();
		//press E and release
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		Thread.sleep(2000);
		//press SHIfT+SemiColumn and release
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		//press backslash and release
        rb.keyPress(KeyEvent.VK_BACK_SLASH);
        rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(1000);
        //type file name
        rb.keyPress(KeyEvent.VK_C);
        rb.keyPress(KeyEvent.VK_O);
        rb.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
        //press enter
        rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	

		


	}
	@AfterTest
	public void teardown(){
		driver.close();
	}
}
