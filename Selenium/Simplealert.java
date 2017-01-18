package toolsQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplealert {

	public static void main(String[] args) {
		String url="http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
driver.findElement(By.id("//*[@id='content']/p[4]/button")).click();
Alert simplealert=driver.switchTo().alert();
String alerttext=simplealert.getText();
System.out.println("alert text is " +alerttext);
simplealert.accept();
	}

}
