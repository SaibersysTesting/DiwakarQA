package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementsinframe {

	public static void main(String[] args) {
			String url="http://toolsqa.com/iframe-practice-page/";
			System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//Switch to first frame(iframe 0)
			WebElement element=driver.findElement(By.id("IF1"));
			driver.switchTo().frame(element);
			//fill some value in the first name and last name
			driver.findElement(By.name("firstname")).sendKeys("Cobie");
			driver.findElement(By.name("lastname")).sendKeys("Smulders");
			//Switch to default cntent
			driver.switchTo().defaultContent();

			//Switch to second frame
			WebElement element1=driver.findElement(By.id("IF2"));
			driver.switchTo().frame(element1);
			//find the first image element and click on it.
			WebElement elmnttoclick=driver.findElement(By.xpath(".//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
			elmnttoclick.click();
			System.out.println("Image is clicked");
			
			

			


			
	}

}
