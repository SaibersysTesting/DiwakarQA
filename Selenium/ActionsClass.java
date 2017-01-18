package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static String url="http://www.amazon.com/";
public static WebDriver driver=new FirefoxDriver();
public static void main(String[] args) {
	

	driver.get(url);
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));

	Actions builder=new Actions(driver);
	builder.moveToElement(element).build().perform();
	driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
	
	driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("ajay.pillagolla@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("Ajjubhai@446");
	driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
	WebElement element1=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));

	builder.moveToElement(element1).build().perform();
driver.findElement(By.linkText("Not ajay? Sign Out")).click();
	
}
}
