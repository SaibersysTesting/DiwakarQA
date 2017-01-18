package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asssert {
public WebDriver driver;
@Test
public void testAssert(){
	driver=new FirefoxDriver();
	driver.get("http://www.store.demoqa.com");
	WebElement myaccount=driver.findElement(By.xpath(".//*[@id='account']/a"));
	String sValue=myaccount.getText();
Assert.assertTrue(myaccount.isDisplayed());
Assert.assertEquals(sValue, "Account My Account");
myaccount.click();
}
}
