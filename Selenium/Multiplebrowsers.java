package AutomationFramework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowsers {
	public static WebDriver driver;
public static void getBrowsers(String browsername){
	Map<String,WebDriver> drivers=new HashMap<String,WebDriver>();
	driver=null;
	switch(browsername){
	case "Firefox":
		driver=drivers.get("Firefox");
		if(driver==null){
			driver=new FirefoxDriver();
			drivers.put("Firefox", driver);
		}
		break;
	case "Chrome":
		drivers.get("Chrome");
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			drivers.put("Chrome", driver);
		}
	}
	
	}
}

