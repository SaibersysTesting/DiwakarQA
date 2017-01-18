package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionAlert {

	public static void main(String[] args) {
		String url="http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
//This step will return alert on the screen
driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
//Once alert is present try to click on button in the page
driver.findElement(By.xpath("//*[@id='content']/p[16]/button")).click();
	}

}
