package AutomationFramework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown {
@Test
	public void ScrollPageDown(){
	System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		String url="http://jqueryui.com/";
		driver.get(url);
		driver.manage().window().maximize();
((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
}
}
