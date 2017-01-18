package toolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwtchbkmainFrm {

	public static void main(String[] args) {
		String url="http://toolsqa.com/iframe-practice-page/";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//first find the element using any locator strategy
	WebElement element=	driver.findElement(By.id("IF1"));
	//Now use the Switch Command
	//driver.switchTo().frame(0);
	driver.switchTo().frame(element);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Do all the required tasks in frame0
	//Switch back to main window
	driver.switchTo().defaultContent();
	
	
		
	}

}
