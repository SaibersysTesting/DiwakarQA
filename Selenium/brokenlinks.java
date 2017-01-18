package AutomationFramework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class brokenlinks {
@Test
public void VerifyBrokenLink() throws Exception{
	System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		String url1="https://www.google.com/";

		driver.get(url1);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		for(int i=0;i<linklist.size();i++){
			WebElement element=linklist.get(i);
			String url=element.getAttribute("href");
			VerifylinkActive(url);
			
		}
	
}
public void VerifylinkActive(String linkurl) throws Exception{
	try {
		URL url=new URL(linkurl);
		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
		httpURLConnect.setConnectTimeout(3000);
		httpURLConnect.connect();
		if(httpURLConnect.getResponseCode()==200){
			System.out.println(linkurl +"-"+httpURLConnect.getResponseMessage());
		}
		//Assert.assertTrue(httpURLConnect.getResponseCode()==200);
		if(httpURLConnect.getResponseCode()==httpURLConnect.HTTP_NOT_FOUND){
			System.out.println(linkurl +"-" +httpURLConnect.getResponseCode()+httpURLConnect.HTTP_NOT_FOUND);
		}
		
	} catch (Exception e) {
		//System.out.println(e.getMessage());
	}
	
}

}
