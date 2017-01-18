package toolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) {
		String url="http://toolsqa.com/automation-practice-switch-windows/";
System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
//maximise the window
driver.manage().window().maximize();
//set up an implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//click on the button alert
driver.findElement(By.xpath(".//*[@id='alert']")).click();
//switch to javascript alert window
Alert myalert=driver.switchTo().alert();
//Accept the alert
myalert.accept();
//close original window
//driver.close();
	}

}
