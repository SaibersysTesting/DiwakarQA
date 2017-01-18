package toolsQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Noofiframes {
public static void main(String[] args) {
	String url="http://toolsqa.com/iframe-practice-page/";
	System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	//switch to frame 0
	//driver.switchTo().frame(0);
	//Switch by frameid
	driver.switchTo().frame("IF1");
	/*
//By executing a javascript
 JavascriptExecutor exe=(JavascriptExecutor)driver;
Integer numberofframes= Integer.parseInt(exe.executeScript("return window.length").toString());
System.out.println("number of frames  " +numberofframes);
//By finding all the webElements using iframe tag
List<WebElement> iframeelements=driver.findElements(By.tagName("iframe"));
System.out.println("the totla number of iframes are  "  +iframeelements.size());*/

}
}
