package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mvetoelement1 {

	public static void main(String[] args) {
		String url="http://store.demoqa.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		/*WebElement element=driver.findElement(By.linkText("Product Category"));
		Actions action=new Actions(driver);
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(".//*[@id='menu-item-36']/a"))).click().build().perform();
		//driver.findElement(By.xpath(".//*[@id='menu-item-36']/a")).click();*/
		WebElement element=driver.findElement(By.linkText("Product Category"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		WebElement SubElement=driver.findElement(By.xpath(".//*[@id='menu-item-36']/a"));
		action.moveToElement(SubElement);
		action.click();
		action.perform();

		
		

		
	}

}
