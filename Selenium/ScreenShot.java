package AutomationFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utilities;

public class ScreenShot {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\Java Softwares\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	Utilities.capturescreenshot(driver,"chromedriver");

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Utilities.capturescreenshot(driver,"facebook");
driver.quit();

	
}
}
