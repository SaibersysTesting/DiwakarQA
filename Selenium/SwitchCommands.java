package toolsQA;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommands {

	public static void main(String[] args) {
		String url="http://toolsqa.com/automation-practice-switch-windows/";
System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Launch the url
driver.get(url);
driver.manage().window().maximize();
//setting up implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Store and Print the First window on the console
String handle=driver.getWindowHandle();
System.out.println(handle);
//click on the button new message window
driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
//Store and print the name of all windows open handles
Set handles =driver.getWindowHandles();
System.out.println(handles);
//Pass a window handle to other window
for(String handle1:driver.getWindowHandles() ){
	System.out.println(handle1);
	driver.switchTo().window(handle1);
	
}
//closing up  pop-up window
//driver.close();
//closing up original window
//driver.quit();


	}

}
